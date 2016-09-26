package utils.helpers;

import java.util.ArrayList;
import java.util.List;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.assertNotEquals;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class BrowserHelper extends ScenarioSteps {

    private final static Logger LOGGER = LoggerFactory.getLogger(BrowserHelper.class);

    private final static int WIDTH = 1024;
    private final static int HEIGHT = 768;

    /**
     * Set default browser resolution
     */
    @Step(callNestedMethods = false)
    public void setResolution() {

        for (int i = 0; i <= 3; i++) {
            try {
                LOGGER.info("Try [{}] to open browser", i);
                getDriver().get(System.getProperty("webdriver.base.url", ""));
                LOGGER.info("Current browser url is {}", getDriver().getCurrentUrl());
                break;
            } catch (Throwable t) {
                if (i == 3) {
                    LOGGER.error("Can't open new browser window", t);
                    throw new Error("Error while open new browser", t);
                }
            }
        }

        LOGGER.info("Set default browser resolution to {}x{}", WIDTH, HEIGHT);

        int width;
        int height;

        if (getDriverType().equals("opera")) {
            JavascriptExecutor js = ((JavascriptExecutor) getDriver());
            width = (int) (long) js.executeScript("return window.innerWidth;");
            height = (int) (long) js.executeScript("return window.innerHeight;");
        } else {
            width = getDriver().manage().window().getSize().width;
            height = getDriver().manage().window().getSize().height;
        }

        if (WIDTH != width || HEIGHT != height) {
            LOGGER.info("Current browser resolution to {}x{}", width, height);
            String browser = getDriverType();
            switch (browser) {
                case "firefox":
                    setFirefoxDimension();
                    break;
                case "chrome":
                    setChromeDimension();
                    break;
                case "internet explorer":
                    setIEDimension(WIDTH, HEIGHT);
                    break;
                case "opera":
                    break;
                default:
                    throw new Error(String.format("Unknown browser type: %s", browser));
            }
        }
    }

    @Step(callNestedMethods = false)
    public void setResolution(int width, int height) {
        String browser = getDriverType();
        switch (browser) {
            case "firefox":
                setFirefoxDimension(width, height);
                LOGGER.info("Current browser resolution is {}x{}", width, height);
                break;
            case "chrome":
                setChromeDimension(width, height);
                LOGGER.info("Current browser resolution is {}x{}", width, height);
                break;
            case "internet explorer":
                setIEDimension(width, height);
                break;
            case "opera":
                break;
            default:
                throw new Error(String.format("Unknown browser type: %s", browser));
        }
    }

    private String getDriverType() {
        WebDriver webDriver = ((WebDriverFacade) getDriver()).getProxiedDriver();
        return ((RemoteWebDriver) webDriver).getCapabilities().getBrowserName();
    }

    private void setFirefoxDimension() {
        setFirefoxDimension(WIDTH, HEIGHT);
    }

    private void setFirefoxDimension(int width, int height) {
        Dimension dimension = new Dimension(width, height);
        getDriver().manage().window().setSize(dimension);
    }

    private void setChromeDimension() {
        try {
            setChromeDimension(WIDTH, HEIGHT);
        } catch (Exception e) {
            JavascriptExecutor js = ((JavascriptExecutor) getDriver());
            String open = String.format("window.open('about:blank','_blank','width=%d,height=%d');", WIDTH, HEIGHT);
            js.executeScript(open);

            // swith on new window
            List<String> windows = new ArrayList<>(getDriver().getWindowHandles());
            int current = windows.indexOf(getDriver().getWindowHandle());
            int last = windows.size() - 1;

            assertNotEquals("New window for switching not found", current, last);
            getDriver().switchTo().window(windows.get(last));

            String resize = String.format("window.resizeTo(%d,%d);", WIDTH, HEIGHT);
            js.executeScript(resize);
            throw new Error(e);
        }
    }

    private void setChromeDimension(int width, int height) {
        Dimension dimension = new Dimension(width, height);
        getDriver().manage().window().setSize(dimension);
    }

    private void setIEDimension(int width, int height) {
        Dimension dimension = new Dimension(width, height);
        getDriver().manage().window().setSize(dimension);
    }
}
