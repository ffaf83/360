package web.steps;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import web.steps.pages.*;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class UserSteps extends ScenarioSteps {

    @Steps
    LandingPageSteps landingPageSteps;

    @Steps
    IntroPageSteps introPageSteps;

    @Steps
    MainPageSteps mainPageSteps;

    @Steps
    SettingsPageSteps settingsPageSteps;

    public LandingPageSteps landingPage() {
        return landingPageSteps;
    }

    public IntroPageSteps introPage() {
        return introPageSteps;
    }

    public MainPageSteps mainPage() {
        return mainPageSteps;
    }

    public SettingsPageSteps settingsPage() {
        return settingsPageSteps;
    }
}
