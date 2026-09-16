package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private By signupLoginLink = By.xpath("//a[@href='/login']");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickSignupLoginLink() {
        wait.until(ExpectedConditions.elementToBeClickable(signupLoginLink)).click();
    }
}
