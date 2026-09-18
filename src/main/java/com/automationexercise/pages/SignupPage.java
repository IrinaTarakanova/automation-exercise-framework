package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class SignupPage extends BasePage {

    private By accountInformationHeading = By.xpath("//b[text()='Enter Account Information']");
    private By mrsTitle = By.id("id_gender2");
    private By passwordInput = By.id("password");
    private By dayDropdown = By.id("days");
    private By monthDropdown = By.id("months");
    private By yearDropdown = By.id("years");
    private By newsletterCheckbox = By.id("newsletter");
    private By offersCheckbox = By.id("optin");
    private By firstNameInput = By.id("first_name");
    private By lastNameInput = By.id("last_name");
    private By companyInput = By.id("company");
    private By address1Input = By.id("address1");
    private By address2Input = By.id("address2");
    private By countryDropdown = By.id("country");
    private By stateInput = By.id("state");
    private By cityInput = By.id("city");
    private By zipcodeInput = By.id("zipcode");
    private By mobileNumberInput = By.id("mobile_number");
    private By createAccountButton = By.xpath("//button[text()='Create Account']");



    public SignupPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAccountInformationHeadingVisible() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(accountInformationHeading)
        ).isDisplayed();
    }



    public void enterAccountInformation(String password, String day, String month, String year) {

        wait.until(ExpectedConditions.elementToBeClickable(mrsTitle));
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).sendKeys(password);
     selectByVisibleText(dayDropdown, day);
       selectByVisibleText(monthDropdown, month);
      selectByVisibleText(yearDropdown, year);
    }

    public void selectNewsletterAndOffers() {
        selectCheckbox(newsletterCheckbox);
        selectCheckbox(offersCheckbox);
    }

    public void enterAddressInformation(String firstName, String lastName, String company,
                                        String address1, String address2, String country,
                                        String state, String city, String zipcode,
                                        String mobileNumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput)).sendKeys(firstName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput)).sendKeys(lastName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(companyInput)).sendKeys(company);
        wait.until(ExpectedConditions.visibilityOfElementLocated(address1Input)).sendKeys(address1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(address2Input)).sendKeys(address2);
        selectByVisibleText(countryDropdown, country);
        wait.until(ExpectedConditions.visibilityOfElementLocated(stateInput)).sendKeys(state);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityInput)).sendKeys(city);
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipcodeInput)).sendKeys(zipcode);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mobileNumberInput)).sendKeys(mobileNumber);
    }

    public void clickCreateAccountButton() {

       wait.until(ExpectedConditions.elementToBeClickable(createAccountButton)).click();
    }
}
