package com.automationexercise.test;

import com.automationexercise.base.BaseTest;
import com.automationexercise.pages.AccountCreatedPage;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void registerNewUserSuccessfully() {
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    SignupPage signupPage = new SignupPage(driver);
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver);

    String username = "User27";
    String email = "user"+System.currentTimeMillis()+"@example.com";

    homePage.clickSignupLoginLink();
        Assert.assertTrue(
                loginPage.isNewUserSignupHeadingVisible(),
                "New User Signup heading should be visible");

    loginPage.signUpNewUser(username, email);
    Assert.assertTrue(
            signupPage.isAccountInformationHeadingVisible(),
            "Account Information heading should be visible"
    );

    signupPage.enterAccountInformation("Password123", "21", "January", "2001");
    signupPage.selectNewsletterAndOffers();
    signupPage.enterAddressInformation("John", "Doe", "Example Inc.", "123 Main St",
            "Apt 4B", "United States", "California", "Los Angeles",
            "90001", "1234567890");
  signupPage.clickCreateAccountButton();
    Assert.assertTrue(
            accountCreatedPage.isAccountCreatedHeadingDisplayed(),
            "Account Created heading should be visible"
    );
    }
}
