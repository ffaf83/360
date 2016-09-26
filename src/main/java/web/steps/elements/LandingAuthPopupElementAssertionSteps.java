package web.steps.elements;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import web.elements.LandingAuthPopupElement;

/**
 * @since Sep 27, 2016
 * @author Aleksei Starostin
 */
public class LandingAuthPopupElementAssertionSteps extends ScenarioSteps {

    private LandingAuthPopupElement getLandingAuthPopupElement() {
        return getPages().onSamePage().getAt(LandingAuthPopupElement.class);
    }

    @Step(callNestedMethods = false)
    public void authPopupShouldNotBeVisible() {
        Assert.assertTrue("Auth popup should not be visible", getLandingAuthPopupElement().isblockAuthPopupVisible());
    }

    @Step(callNestedMethods = false)
    public void messageInvalidLoginShouldBeDisplayed() {
        Assert.assertTrue("Invalid login or password message should be displayed",
                getLandingAuthPopupElement().isInvalidLoginOrPasswordDisplayed());
    }
}
