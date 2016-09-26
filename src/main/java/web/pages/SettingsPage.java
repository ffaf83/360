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
@DefaultUrl("/web/settings/")
@At("#HOST/web/settings/")
public class SettingsPage extends AbstractPageObject {

    @FindBy(className = "logout")
    private WebElement buttonLogout;

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    public void pressButtonLogout() {
        buttonLogout.click();
        waitForElementNotPresent(buttonLogout);
    }
}
