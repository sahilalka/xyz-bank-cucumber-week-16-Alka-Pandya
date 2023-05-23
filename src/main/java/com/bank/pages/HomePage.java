package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[text()='Bank Manager Login']")
    WebElement bankManagerLogin;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

    @CacheLookup
    @FindBy(xpath = "//label[text()='Your Name :']")
    WebElement yourNameText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeButton;

    public void clickOnCustomerLoginButton() {
        log.info("Click on customer login button "+customerLogin.toString());
        clickOnElement(customerLogin);
    }
    public String verifyYourNameText() {
        log.info("Verify text "+yourNameText.toString());
        return getTextFromElement(yourNameText);
    }
    public void clickOnBankManagerLoginButton(){
        log.info("Click on bank manager login button "+bankManagerLogin.toString());
        clickOnElement(bankManagerLogin);
    }
    public void clickOnHomeButton(){
        log.info("Click on home button "+homeButton.toString());
        clickOnElement(homeButton);
    }


}
