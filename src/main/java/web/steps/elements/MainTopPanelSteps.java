package web.steps.elements;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class MainTopPanelSteps extends ScenarioSteps {

    @Steps
    MainTopPanelAssertionSteps mainTopPanelAssertionSteps;

    public MainTopPanelAssertionSteps assertThat() {
        return mainTopPanelAssertionSteps;
    }
}
