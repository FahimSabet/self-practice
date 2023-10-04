package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tek.bdd.utility.SeleniumUtility;

public class Hooks extends SeleniumUtility {

    // this hook will be executed before and after each scenario
    @Before
    public void setUpTests () {
        openBrowser();

    }
    @After
    public void cleanUpTests () {
        quitDriver();
    }
}
