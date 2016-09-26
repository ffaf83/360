package web.tests.auth.popup.signup;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Pending;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.dataobjects.User;
import utils.dataobjects.users.Users;
import utils.helpers.SuiteWrapper;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
@RunWith(SerenityRunner.class)
public class SigningUpUsingPopupSuite extends SuiteWrapper {

    @Test
    @Issue("#1")
    public void userWithAcceptableEmailAndPasswordShouldBeAbleToSignUp() {
        User user = Users.getUnique();

        userSteps.landingPage().openPage();
        userSteps.landingPage().topPanel().pressButtonStartReading();
        userSteps.landingPage().authPopup().clickLinkSignInWithEmail();
        userSteps.landingPage().authPopup().clickLinkSignUp();
        userSteps.landingPage().authPopup().typeEmail(user.getEmail());
        userSteps.landingPage().authPopup().typePassword(user.getPassword());
        userSteps.landingPage().authPopup().typePasswordConfirm(user.getPassword());
        userSteps.landingPage().authPopup().pressButtonSubmitSignUp();
        userSteps.introPage().pressButtonStartReading();
        userSteps.mainPage().topPanel().assertThat().elementWithUserLoginNameShouldPresentInTopMenu(user);
    }

    @Pending
    @Test
    @Issue("#2")
    public void userWithAcceptableEmailAndPasswordShouldBeAbleToSignUpAfterUnsuccessfulSubmitting() {
    }
}
