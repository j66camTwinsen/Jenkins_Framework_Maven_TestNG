package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utility.Utility;

public class DriverInstance {

    public WebDriver driver;

    @BeforeMethod
    public void initiateDriverInstance() throws Exception {

        switch (Utility.fetchPropertyValue("BrowserName").toString().toLowerCase()) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                throw new Exception("Incorrect Browser");
        }
        driver.manage().window().maximize();
        driver.get(Utility.fetchPropertyValue("ApplicationURL").toString());
    }

    @AfterMethod
    public void closeDriverInstance() {
        driver.quit();
    }
}
