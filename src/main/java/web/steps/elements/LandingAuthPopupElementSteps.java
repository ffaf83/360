package web.steps.elements;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import web.elements.LandingAuthPopupElement;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class LandingAuthPopupElementSteps extends ScenarioSteps {

    private LandingAuthPopupElement landingAuthPopupElement;

    private LandingAuthPopupElement getLandingAuthPopupElement() {
        return landingAuthPopupElement;
    }

    @Step(callNestedMethods = false)
    public void clickLinkSignInWithEmail() {
        getLandingAuthPopupElement().clickLinkSignInWithEmail();
    }

    @Step(callNestedMethods = false)
    public void clickLinkSignUp() {
        getLandingAuthPopupElement().clickLinkSignUp();
    }

    @Step(callNestedMethods = false)
    public void typeEmail(String email) {
        getLandingAuthPopupElement().typeEmail(email);
    }

    @Step(callNestedMethods = false)
    public void typePassword(String password) {
        getLandingAuthPopupElement().typePassword(password);
    }

    @Step(callNestedMethods = false)
    public void typePasswordConfirm(String passwordConfirm) {
        getLandingAuthPopupElement().typePasswordConfirm(passwordConfirm);
    }

    @Step(callNestedMethods = false)
    public void pressButtonSubmitSignUp() {
        getLandingAuthPopupElement().pressButtonSubmitSignUp();
    }
}
