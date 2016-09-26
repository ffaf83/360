package web.steps.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import web.pages.IntroPage;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class IntroPageSteps extends ScenarioSteps {

    protected IntroPage getIntroPage() {
        return getPages().onSamePage().getAt(IntroPage.class);
    }

    @Step(callNestedMethods = false)
    public void pressButtonStartReading() {
        getIntroPage().pressButtonStartReading();
    }
}
