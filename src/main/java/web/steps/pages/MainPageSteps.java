package web.steps.pages;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import web.steps.elements.MainTopPanelSteps;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class MainPageSteps extends ScenarioSteps {

    @Steps
    private MainTopPanelSteps mainTopPanelSteps;

    public MainTopPanelSteps topPanel() {
        return mainTopPanelSteps;
    }
}
