package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PurchaseItem extends Base{

    @Test
    public void enterUsernameTests(){
        loginPage.enterUsername("standard_user");
    }

    @Test
    public void enterPasswordTests(){
        loginPage.enterPassword("secret_sauce");
    }

    @Test(dependsOnMethods = {"enterPasswordTests","enterUsernameTests"})
    public void clickLoginButtonTests(){
        loginPage.clickLoginButton();
    }
    @Test(dependsOnMethods = "clickLoginButtonTests")
    public void verifyLoginSuccessTests(){
        homePage.verifyUserIsLoggedIn();
    }
    @Test(dependsOnMethods = "clickLoginButtonTests")
    public void verifyAddToCartButtonTests(){
        homePage.verifyAddToCartButtonIsDisplayed();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();

    }



}
