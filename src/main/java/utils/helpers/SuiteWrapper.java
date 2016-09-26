package utils.helpers;

import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import org.openqa.selenium.WebDriver;
import web.steps.UserSteps;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public abstract class SuiteWrapper {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages
    public Pages pages;

    @Steps
    public UserSteps userSteps;
}
