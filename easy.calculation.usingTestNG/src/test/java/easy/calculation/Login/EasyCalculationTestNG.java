package easy.calculation.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class EasyCalculationTestNG {

    WebDriver driver;

    
    String url = "https://www.login.hiox.com/login?referrer=easycalculation.com";

    @Parameters("browserName")
    @BeforeTest
    public void setUp(@Optional("chrome") String browserName) {

        System.out.println("Launching browser: " + browserName);

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } 
        else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } 
        else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } 
        else {
            System.out.println("Invalid browser. Launching Chrome by default.");
            driver = new ChromeDriver();
        }
    }

    @Test
    public void BrowserTest() throws Exception {

        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        System.out.println("Page title: " + driver.getTitle());
    }

    @AfterTest
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}