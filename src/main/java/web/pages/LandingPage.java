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
@DefaultUrl("/")
@At("#HOST/")
public class LandingPage extends AbstractPage {

    @FindBy(css = ".bLogo")
    private WebElement imageLogo;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void waitForPageToLoad() {
        waitFor(imageLogo);
    }
}
