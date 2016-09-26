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
public class BorderConditionsInUserDataWhileSigningUpSuite extends SuiteWrapper {

    @Pending
    @Test
    @Issue("#19")
    public void userShouldBeAbleToSignUpWithTheShortestEmail() {
    }

    @Pending
    @Test
    @Issue("#20")
    public void userShouldBeAbleToSignUpWithTheLongestEmail() {
    }

    @Pending
    @Test
    @Issue("#17")
    public void userShouldBeAbleToSignUpWithTheShortestPassword() {
    }

    @Pending
    @Test
    @Issue("#18")
    public void userShouldBeAbleToSignUpWithTheLongestPassword() {
    }
}
