package web.tests.auth.popup.restoring.password;

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
public class RestoringPasswordSuite extends SuiteWrapper {

    @Pending
    @Test
    @Issue("#11")
    public void existingUserShouldBeAbleToRestorePassword() {
    }

    @Pending
    @Test
    @Issue("#12")
    public void nonexistentUserShouldReceiveErrorOnRestoringPassword() {
    }
}
