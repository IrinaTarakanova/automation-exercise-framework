package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private By newUserSignupHeading = By.xpath("//h2[text()='New User Signup!']");
    private By nameInput = By.name("name");
    private By emailInput = By.xpath("//input[@data-qa='signup-email']");
    private By signupButton = By.cssSelector("[data-qa='signup-button']");



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isNewUserSignupHeadingVisible() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(newUserSignupHeading)
        ).isDisplayed();
    }

    public void signUpNewUser(String userName, String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameInput)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput)).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(signupButton)).click();
    }
}
