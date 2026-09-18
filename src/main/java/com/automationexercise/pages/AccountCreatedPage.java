package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountCreatedPage extends BasePage {

    private By accountCreatedHeading = By.xpath("//b[text()='Account Created!']");


    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAccountCreatedHeadingDisplayed() {
      return  wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreatedHeading)).isDisplayed();
    }
}
