package web.pages;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
@DefaultUrl("/web/")
@At("#HOST/web/")
public class MainPage extends AbstractPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }


}
