package web.elements;

import java.util.Locale;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.dataobjects.User;
import web.pages.AbstractPage;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class MainTopPanel extends AbstractPage {
    
    public MainTopPanel(WebDriver driver) {
        super(driver);
    }

    public boolean isUserSignedIn(User user) {
        return isElementPresent(
                By.xpath("//span[contains(@class,'username')][contains(.,'" + user.getLogin().toUpperCase(Locale.US) + "')]"));
    }
}
