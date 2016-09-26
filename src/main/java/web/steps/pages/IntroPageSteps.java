package web.steps.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import web.pages.IntroPage;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class IntroPageSteps extends ScenarioSteps {

    private IntroPage introPage;

    protected IntroPage getIntroPage() {
        return introPage;
    }

    @Step(callNestedMethods = false)
    public void pressButtonStartReading() {
        getIntroPage().pressButtonStartReading();
    }
}
