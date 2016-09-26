package web.tests.auth.popup.signup;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Pending;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.helpers.SuiteWrapper;

/**
 * @since Sep 26, 2016
 * @author Aleksei
 */
@RunWith(SerenityRunner.class)
public class ValidatingWrongFormWhileSignUpSuite extends SuiteWrapper {

    @Pending
    @Test
    @Issue("#3")
    public void signingUpUserWithEmptyEmailShouldReturnValidationError() {
    }

    @Pending
    @Test
    @Issue("#4")
    public void signingUpUserWithInvalidEmailShouldReturnValidationError() {
    }

    @Pending
    @Test
    @Issue("#5")
    public void signingUpUserWithTooShortPasswordShouldReturnValidationError() {
    }

    @Pending
    @Test
    @Issue("#6")
    public void signingUpUserWithWrongConfirmationPasswordShouldReturnValidationError() {
    }
}
