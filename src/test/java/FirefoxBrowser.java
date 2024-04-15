import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxBrowser {

    WebDriver driver;

    @Test
//    Methode - Methode name should start with LowerCase those are the coding standards
    public void startFirefoxBrowser() {

//        The child carries the Browser functionalities
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

    }
}
