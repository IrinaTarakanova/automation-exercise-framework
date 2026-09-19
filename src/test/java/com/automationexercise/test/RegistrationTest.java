package com.automationexercise.test;

import com.automationexercise.base.BaseTest;
import com.automationexercise.data.UserData;
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
        UserData user = new UserData();

        user.setUserName("Irina Test");
        user.setEmail("testuser" + System.currentTimeMillis() + "@example.com");
        user.setPassword("Test123!");

        user.setDay("15");
        user.setMonth("May");
        user.setYear("1995");
        user.setFirstName("Irina");
        user.setLastName("Tester");
        user.setCompany("QA Test Company");
        user.setAddress1("10 Test Street");
        user.setAddress2("Apartment 2");
        user.setCountry("Canada");
        user.setState("Lincolnshire");
        user.setCity("Bourne");
        user.setZipcode("PE10 0AA");
        user.setMobileNumber("07123456789");


    homePage.clickSignupLoginLink();
        Assert.assertTrue(
                loginPage.isNewUserSignupHeadingVisible(),
                "New User Signup heading should be visible");

    loginPage.signUpNewUser(user.getUserName(), user.getEmail());
    Assert.assertTrue(
            signupPage.isAccountInformationHeadingVisible(),
            "Account Information heading should be visible"
    );

    signupPage.enterAccountInformation(user);
    signupPage.selectNewsletterAndOffers();
    signupPage.enterAddressInformation(user);
    signupPage.clickCreateAccountButton();
    Assert.assertTrue(
            accountCreatedPage.isAccountCreatedHeadingDisplayed(),
            "Account Created heading should be visible"
    );
    }
}
