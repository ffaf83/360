package web.elements;

import java.util.Locale;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utils.dataobjects.User;
import web.pages.AbstractPageObject;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class MainTopPanel extends AbstractPageObject {

    @FindBy(className = "user")
    private WebElement iconUser;
    
    public MainTopPanel(WebDriver driver) {
        super(driver);
    }

    public boolean isUserSignedIn(User user) {
        return isElementPresent(
                By.xpath("//span[contains(@class,'username')][contains(.,'" + user.getLogin().toUpperCase(Locale.US) + "')]"));
    }

    public void clickUserIcon() {
        iconUser.click();
    }
}
