package web.tests.auth.popup.signin;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Pending;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.dataobjects.User;
import utils.dataobjects.users.Users;
import utils.helpers.SuiteWrapper;

/**
 * @since Sep 26, 2016
 * @author Aleksei
 */
@RunWith(SerenityRunner.class)
public class SigningInSuite extends SuiteWrapper {

    @Test
    @Issue("#9")
    public void existingUserShouldBeAbleToSignInWithEmailAndPassword() {
        User user = Users.getUnique();

        userSteps.landingPage().openPage();
        userSteps.landingPage().topPanel().pressButtonStartReading();
        userSteps.landingPage().authPopup().clickLinkSignInWithEmail();
        userSteps.landingPage().authPopup().clickLinkSignUp();
        userSteps.landingPage().authPopup().fillAndSendSignUpForm(user);
        userSteps.introPage().pressButtonStartReading();
        userSteps.mainPage().topPanel().clickUserIcon();
        userSteps.settingsPage().pressButtonLogout();
        userSteps.landingPage().topPanel().pressButtonStartReading();
        userSteps.landingPage().authPopup().clickLinkSignInWithEmail();
        userSteps.landingPage().authPopup().typeSignInEmail(user.getEmail());
        userSteps.landingPage().authPopup().typeSignInPassword(user.getPassword());
        userSteps.landingPage().authPopup().pressButtonSubmitSignIn();
        userSteps.mainPage().topPanel().assertThat().elementWithUserLoginNameShouldPresentInTopMenu(user);
    }

    @Pending
    @Test
    @Issue("#10")
    public void existingUserShouldNotBeAbleToSignInWithoutPassword() {
    }
}
