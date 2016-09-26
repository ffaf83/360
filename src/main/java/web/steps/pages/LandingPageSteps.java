package web.steps.pages;

import net.thucydides.core.annotations.*;
import net.thucydides.core.steps.ScenarioSteps;
import utils.helpers.BrowserHelper;
import web.pages.LandingPage;
import web.steps.elements.LandingAuthPopupElementSteps;
import web.steps.elements.LandingTopPanelSteps;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class LandingPageSteps extends ScenarioSteps {

    @Steps
    private LandingTopPanelSteps landingTopPanelSteps;

    @Steps
    private LandingAuthPopupElementSteps landingAuthPopupElementSteps;

    @Steps
    private BrowserHelper resolutionHelper;

    public LandingTopPanelSteps topPanel() {
        return landingTopPanelSteps;
    }

    public LandingAuthPopupElementSteps authPopup() {
        return landingAuthPopupElementSteps;
    }

    private LandingPage getLandingPage() {
        return getPages().onSamePage().getAt(LandingPage.class);
    }

    @Step(callNestedMethods = false)
    public void openPage() {
        resolutionHelper.setResolution();
        getLandingPage().open();
    }
}
