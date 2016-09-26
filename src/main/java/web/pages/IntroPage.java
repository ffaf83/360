package web.pages;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
@DefaultUrl("/web/intro/")
@At("#HOST/web/intro/")
public class IntroPage extends AbstractPageObject {

    @FindBy(css = ".intro .startReading")
    private WebElement buttonStartReading;

    public IntroPage(WebDriver driver) {
        super(driver);
    }

    public void pressButtonStartReading() {
        waitFor(buttonStartReading);
        buttonStartReading.click();
    }
}
