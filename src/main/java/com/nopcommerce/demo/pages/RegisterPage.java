package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement checkRegisterText;
    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement gender;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement day;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement month;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement year;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement checkRegistrationText;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueTab;


    public String verifyRegisterText() {
        log.info("Verify register text" + checkRegisterText.toString());
        return getTextFromElement(checkRegisterText);
    }

    public void mandatoryFields() {
        log.info("Click on gender" + gender.toString());
        log.info("Enter first name" + firstName.toString());
        log.info("Enter last name" + lastName.toString());
        log.info("Select day" + day.toString());
        log.info("Select month" + month.toString());
        log.info("Select year" + year.toString());
        log.info("Enter email" + email.toString());
        log.info("Enter password" + password.toString());
        log.info("Enter confirm password" + confirmPassword.toString());

        clickOnElement(gender);
        sendTextToElement(firstName, "Abc");
        sendTextToElement(lastName, "Def");
        selectByVisibleTextFromDropDown(day, "2");
        selectByVisibleTextFromDropDown(month, "May");
        selectByVisibleTextFromDropDown(year, "1995");
        sendTextToElement(email, getRandomString(5) +"@gmail.com");
        sendTextToElement(password, "Abc@010");
        sendTextToElement(confirmPassword, "Abc@010");
    }

    public void clickOnRegistrationButton() {
        log.info("Click on registration button" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyRegistrationText() {
        log.info("Verify registration text" + checkRegistrationText.toString());
        return getTextFromElement(checkRegistrationText);
    }

    public void clickOnContinueTab() {
        log.info("Click on continue tab" + continueTab.toString());
        clickOnElement(continueTab);
    }
}
