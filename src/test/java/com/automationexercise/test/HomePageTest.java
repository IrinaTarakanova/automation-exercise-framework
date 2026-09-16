package com.automationexercise.test;

import com.automationexercise.base.BaseTest;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLObjectElement;

@Slf4j
public class HomePageTest extends BaseTest {


    @Test
    public void verifyHomePageLoads() {
        String actualTitle = driver.getTitle();
        System.out.println("Page title: " + actualTitle);

        Assert.assertEquals(
                actualTitle,
                "Automation Exercise",
                "Home page title is incorrect"
        );
    }

    @Test
    public void userCanNavigateToSignupLoginPage() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.clickSignupLoginLink();
        Assert.assertTrue(
                loginPage.isNewUserSignupHeadingVisible(),
                "New User Signup heading should be visible"
        );
    }
}