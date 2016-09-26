package web.steps.elements;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import web.elements.LandingTopPanel;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class LandingTopPanelSteps extends ScenarioSteps {
    
    private LandingTopPanel landingTopPanel;

    protected LandingTopPanel getLandingTopPanel() {
        return landingTopPanel;
    }

    @Step(callNestedMethods = false)
    public void pressButtonStartReading() {
        getLandingTopPanel().pressButtonStartReading();
    }
}
