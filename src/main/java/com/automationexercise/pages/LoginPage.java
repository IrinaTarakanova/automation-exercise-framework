package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private By newUserSignupHeading = By.xpath("//h2[text()='New User Signup!']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isNewUserSignupHeadingVisible() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(newUserSignupHeading)
        ).isDisplayed();
    }
}
