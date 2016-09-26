package web.steps.elements;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import web.elements.MainTopPanel;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class MainTopPanelSteps extends ScenarioSteps {

    @Steps
    MainTopPanelAssertionSteps mainTopPanelAssertionSteps;

    private MainTopPanel getMainTopPanel() {
        return getPages().onSamePage().getAt(MainTopPanel.class);
    }

    public MainTopPanelAssertionSteps assertThat() {
        return mainTopPanelAssertionSteps;
    }

    @Step(callNestedMethods = false)
    public void clickUserIcon() {
        getMainTopPanel().clickUserIcon();
    }
}
