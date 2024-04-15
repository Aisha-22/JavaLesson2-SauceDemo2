import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeBrowser {
    //    declare a WebDriver (Creating an instance of a WebDriver)
    WebDriver driver;

    //    To make the below test Executable we use testNG
    @Test
//    Methode - Methode name should start with LowerCase those are the coding standards
    public void startChromeBrowser() {

//        The child carries the Browser functionalities
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        Maximize the Window
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();


//        We have a 'Product' Element - Go to the Element and get the text of that Element
        String product = driver.findElement(By.xpath("//span[contains(.,'Products')]")).getText();

        //Assertions to Verify
        Assert.assertEquals(product, "Expected");


        driver.close();


    }


}
