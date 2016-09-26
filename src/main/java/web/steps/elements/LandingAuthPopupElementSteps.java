package web.steps.elements;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import utils.dataobjects.User;
import web.elements.LandingAuthPopupElement;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class LandingAuthPopupElementSteps extends ScenarioSteps {

    @Steps
    protected LandingAuthPopupElementAssertionSteps landingAuthPopupElementAssertionSteps;

    private LandingAuthPopupElement getLandingAuthPopupElement() {
        return getPages().onSamePage().getAt(LandingAuthPopupElement.class);
    }

    public LandingAuthPopupElementAssertionSteps assertThat() {
        return landingAuthPopupElementAssertionSteps;
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
    public void typeSignUpEmail(String email) {
        getLandingAuthPopupElement().typeSignUpEmail(email);
    }

    @Step(callNestedMethods = false)
    public void typeSignUpPassword(String password) {
        getLandingAuthPopupElement().typeSignUpPassword(password);
    }

    @Step(callNestedMethods = false)
    public void typeSignUpPasswordConfirm(String passwordConfirm) {
        getLandingAuthPopupElement().typeSignUpPasswordConfirm(passwordConfirm);
    }

    @Step(callNestedMethods = false)
    public void pressButtonSubmitSignUp() {
        getLandingAuthPopupElement().pressButtonSubmitSignUp();
    }

    @Step(callNestedMethods = false)
    public void fillAndSendSignUpForm(User user) {
        typeSignUpEmail(user.getEmail());
        typeSignUpPassword(user.getPassword());
        typeSignUpPasswordConfirm(user.getPassword());
        pressButtonSubmitSignUp();
    }

    @Step(callNestedMethods = false)
    public void typeSignInEmail(String email) {
        getLandingAuthPopupElement().typeSignInEmail(email);
    }

    @Step(callNestedMethods = false)
    public void typeSignInPassword(String password) {
        getLandingAuthPopupElement().typeSignInPassword(password);
    }


    @Step(callNestedMethods = false)
    public void pressButtonSubmitSignIn() {
        getLandingAuthPopupElement().pressButtonSubmitSignIn();
    }

    @Step(callNestedMethods = false)
    public void clickIconClosePopup() {
        getLandingAuthPopupElement().clickIconClosePopup();
    }
}
