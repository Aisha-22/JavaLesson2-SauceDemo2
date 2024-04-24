//LogingPage Class created under Page Package
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// Calling the Class
public class LoginPage {

    public WebDriver driver;

    //    Creating Elements (Ctrl+Alt+l)
    @FindBy(xpath = "//input[@id='user-name']")
//    Created a variable (username_xpath)
            WebElement username_xpath;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password_xpath;
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton_xpath;

    //    Constructor for each and every page - For Execution to happen in all other classes
//    The LoginPage Method below is created from the Class itself
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //  Creating a Method to use across - For every Element created
//    'void' is used because the method is not returning anything
    public void enterUsername(String username) {
//        The reason for the 'Wait Method' is to prevent unnecessary failures
//        The variable 'username_xpath' is reused
//        Tests a written for the slowest nextwork connection - TimeOut: If the Element does not load in 'X' amount of seconds then stop with the test
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(username_xpath));
//        Placeholder for the 'username'
        username_xpath.sendKeys(username);
    }

    public void enterPassword(String password) {

        password_xpath.sendKeys(password);
    }

    public void clickLoginButton() {

        loginButton_xpath.click();
    }


}
