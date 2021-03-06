package web.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.pages.AbstractPageObject;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class LandingTopPanel extends AbstractPageObject {

    @FindBy(css = ".startreading")
    private WebElement buttonStartReading;

    public LandingTopPanel(WebDriver driver) {
        super(driver);
    }

    public void pressButtonStartReading() {
        buttonStartReading.click();
    }
}
