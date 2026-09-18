package com.automationexercise.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(5));
        By consentButton = By.cssSelector("button[aria-label='Consent']");

        try {
            wait.until(ExpectedConditions.elementToBeClickable(consentButton)).click();
        }
        catch (Exception e) {
            System.out.println("Consent button not found or not clickable.");
        }
    }


  @AfterMethod
   public void tearDown(){
       if (driver != null) {
          driver.quit();
       }
   }

}
