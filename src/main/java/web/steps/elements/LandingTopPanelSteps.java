package web.steps.elements;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import web.elements.LandingTopPanel;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class LandingTopPanelSteps extends ScenarioSteps {    

    protected LandingTopPanel getLandingTopPanel() {
        return getPages().onSamePage().getAt(LandingTopPanel.class);
    }

    @Step(callNestedMethods = false)
    public void pressButtonStartReading() {
        getLandingTopPanel().pressButtonStartReading();
    }
}
