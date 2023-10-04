package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {

    private static WebDriver driver;
    private final String App_URL = "https://qa.insurance.tekschool-students.com/" ;

    public void openBrowser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(App_URL);
    }

    public void quitDriver () {
        if (driver != null)
            driver.close();
    }

    public WebDriver getDriver () {
        return driver;
    }

}
