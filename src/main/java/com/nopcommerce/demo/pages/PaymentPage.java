package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PaymentPage extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentPage.class.getName());

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardRadioButton;
    @CacheLookup
    @FindBy(xpath = "//li[4]/div[2]/div[1]/button[1]")
    WebElement clickOnContinue;

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement masterCard;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//li[5]/div[2]/div[1]/button[1]")
    WebElement clickContinueButton;

    public void clickOnCreditCardRadioButton() {
        log.info("CLick on credit card radio button" + creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void setClickOnContinue() {
        log.info("Click on continue" + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }

    public void selectMasterCard() {
        log.info("Select master card" + masterCard.toString());
        selectByVisibleTextFromDropDown(masterCard, "Master card");
    }

    public void fillPaymentDetails() {
        log.info("Enter card holder name" + cardHolderName.toString());
        log.info("Enter card number" + cardNumber.toString());
        log.info("Select expire month" + expireMonth.toString());
        log.info("Select expire year" + expireYear.toString());
        log.info("Enter card code" + cardCode.toString());
        log.info("Click on continue button" + clickContinueButton.toString());


        sendTextToElement(cardHolderName, "Jack Leach");
        sendTextToElement(cardNumber, "5555555555554444");
        selectByVisibleTextFromDropDown(expireMonth, "06");
        selectByVisibleTextFromDropDown(expireYear, "2026");
        sendTextToElement(cardCode, "624");
        clickOnElement(clickContinueButton);
    }
}
