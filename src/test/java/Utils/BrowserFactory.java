//Reusable Class
package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

// Creating a Framework
public class BrowserFactory {

//    Initialize a Browser
//    (Public Static is to be used on other Classes as well as other Methods - (Static means it wont change))
    public static WebDriver driver;

//    Create a Method to start a Browser - Passing to Parameters (e.g(String browserChoice, String url))
//    Public Static Method you have to return a Statement
    public static WebDriver startBrowser(String browserChoice, String url) {
//        Instance of a Browser - In an 'If' Statement only one condition can be passed at a time
        if ("chrome".equalsIgnoreCase(browserChoice)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if ("firefox".equalsIgnoreCase(browserChoice)) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if ("edge".equalsIgnoreCase(browserChoice)) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
//            Safari is the Default Browser - So you can have it as an empty string (e.g "") Execute to start a browser
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

//    Create a Browser Method Start a Browser to Execute you use the '@Test' notation
//    @Test
//    public void test(){
//        startBrowser("Chrome", "https://www.saucedemo.com/");
//    }

}
