// Test Case - Verify that User is logged in successfully
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {

    public WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement product_xpath;
    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartButton_xpath;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyUserIsLoggedIn() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(product_xpath));
//        isDisplayed returns a Boolean Value (True/False)
//        product_xpath.isDisplayed();
        String productText = product_xpath.getText();
        Assert.assertEquals(productText,"Products");

    }
    public void verifyAddToCartButtonIsDisplayed() {
       addToCartButton_xpath.isDisplayed();
    }


}
