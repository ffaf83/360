package web.steps.elements;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import utils.dataobjects.User;
import web.elements.MainTopPanel;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class MainTopPanelAssertionSteps extends ScenarioSteps {

    private MainTopPanel mainTopPanel;

    private MainTopPanel getMainTopPanel() {
        return mainTopPanel;
    }

    @Step(callNestedMethods = false)
    public void elementWithUserLoginNameShouldPresentInTopMenu(User user) {
        Assert.assertTrue(String.format("User login [%s] should be on the page", user.getLogin()),
                getMainTopPanel().isUserSignedIn(user));
    }
}
