package web.tests.auth.popap.misc;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Pending;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.helpers.SuiteWrapper;

/**
 * @since Sep 26, 2016
 * @author Aleksei <starostin@truckerpath.com>
 */
@RunWith(SerenityRunner.class)
public class AuthPopupBehaviourSuite extends SuiteWrapper {

    @Pending
    @Test
    @Issue("#13")
    public void userShouldBeAbleToClosePopupAuthFormByClickingCrossIcon() {
    }

    @Pending
    @Test
    @Issue("#14")
    public void userShouldBeAbleToClosePopupAuthFormByClickingOutside() {
    }

    @Pending
    @Test
    @Issue("#15")
    public void cancelButtonShouldCloseAuthFormAndShowSocialButtons() {
    }

    @Pending
    @Test
    @Issue("#16")
    public void userShouldBeAbleToFillAndSubmitAuthFormUsingKeyboardKeys() {
    }

    @Pending
    @Test
    @Issue("#21")
    public void signUpAndCancelButtonsShouldBeDisabledAfterFormSubmission() {
    }
}
