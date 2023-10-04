package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.utility.SeleniumUtility;

import java.time.Duration;

public class CommonSteps extends SeleniumUtility {


    @Given("Open browser and navigate")
    public void openBrowserAndNavigate () {
        openBrowser();

    }

@Then("Validate application title should be {string}")
    public void validateApplicationTitle (String expectedAppTitle) {
        String actualAppTitle = getDriver().getTitle();

    Assert.assertEquals("Application Title Validation", expectedAppTitle, actualAppTitle);
    }

    @Then("Close browser")
    public void closeBrowser () {
        quitDriver();

    }



    @Then("Validate the header title is {string}")
    public void validateHeaderTitle(String expectedHeaderTitle) {

      By pageTitleLocator = By.xpath("//mat-toolbar/span[1]");


      // the below method can be commented as we created a new method in the SeleniumUtility to do this job for us.

//        WebDriverWait waitDriver = new WebDriverWait(getDriver(), Duration.ofMinutes(1));
//         WebElement pageTitleElement = waitDriver.until(ExpectedConditions.visibilityOfElementLocated(pageTitleLocator));
//        String actualHeaderTitle=  pageTitleElement.getText();

        String actualHeaderTitle = getElementText(pageTitleLocator);

        Assert.assertEquals("Validate Header Title", expectedHeaderTitle, actualHeaderTitle);




    }


}
