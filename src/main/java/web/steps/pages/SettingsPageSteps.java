package web.steps.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import web.pages.SettingsPage;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class SettingsPageSteps extends ScenarioSteps {

    private SettingsPage getSettingsPage() {
        return getPages().onSamePage().getAt(SettingsPage.class);
    }

    @Step(callNestedMethods = false)
    public void pressButtonLogout() {
        getSettingsPage().pressButtonLogout();
    }
}
