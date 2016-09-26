package web.tests.auth.popup.signin;

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
public class SigningInSuite extends SuiteWrapper {

    @Pending
    @Test
    @Issue("#9")
    public void existingUserShouldBeAbleToSignInWithEmailAndPassword() {
    }

    @Pending
    @Test
    @Issue("#10")
    public void existingUserShouldNotBeAbleToSignInWithoutPassword() {
    }
}
