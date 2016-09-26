package web.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.scheduling.ThucydidesFluentWait;
import org.openqa.selenium.*;
import utils.helpers.InvisibilityOfElement;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public abstract class AbstractPage extends PageObject {

    private static final int DEFAULT_IMPLICITLY_WAIT = 15000;
    private final int implicitWait = Integer.parseInt(System.getProperty("webdriver.timeouts.implicitlywait", Integer.toString(DEFAULT_IMPLICITLY_WAIT)));

    public AbstractPage(WebDriver driver) {
        super(driver);
    }

    protected boolean isElementPresent(By locator) {
        List<WebElement> elements = getDriver().findElements(locator);
        return elements.size() > 0;
    }

    protected boolean waitForElementNotPresent(WebElement element) {
        return waitForElementNotPresent(element, implicitWait);
    }

    protected boolean waitForElementNotPresent(WebElement element, int timeout) {
        setImplicitTimeout(0, TimeUnit.MILLISECONDS);
        Boolean result = true;
        ThucydidesFluentWait<WebDriver> wait = waitForCondition()
            .withTimeout(timeout, TimeUnit.MILLISECONDS)
            .pollingEvery(500, TimeUnit.MILLISECONDS);
        WebElement wef = $(element).withTimeoutOf(100, TimeUnit.MILLISECONDS);
        try {
            wait.until(new InvisibilityOfElement(wef));
        } catch (TimeoutException e) {
            result = false;
        } catch (Throwable t) {
            throw new Error(t);
        } finally {
            resetImplicitTimeout();
        }
        return result;
    }
}
