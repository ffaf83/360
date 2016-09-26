package web.tests.auth.popup.signup;

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
public class ValidatingWrongDataWhileSignUpSuite extends SuiteWrapper {

    @Pending
    @Test
    @Issue("#7")
    public void existingUserShouldNotBeAbleToSignUpTwiceWithTheSameEmail() {
    }

    @Pending
    @Test
    @Issue("#8")
    public void existingUserShouldNotBeAbleToSignUpTwiceWithOnlyCharacterCaseDifferenceInEmail() {
    }
}
