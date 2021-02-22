package pages;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void beforeCenario(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.grocerycrud.com/demo/bootstrap_theme");
    }

    public static WebDriver getDriver(){
        return driver;
    }

    @After
    public void AfterCenario(Scenario scenario) throws Exception {
       gravarImagem(scenario);
       driver.quit();
    }

    private void gravarImagem(Scenario scenario) {
        try {
            scenario.write("Current Page URL is " + driver.getCurrentUrl());
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
    }
}
