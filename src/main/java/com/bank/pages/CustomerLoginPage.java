package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    //@FindBy(id = "userSelect")
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement logout;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameMessage;


    public void searchCustomerName() throws InterruptedException {
        Thread.sleep(2000);
        // selectByVisibleTextFromDropDown(searchCustomer, "John Smith");
        selectByIndexFromDropDown(searchCustomer,2);
    }
    public void selectHarryPotterFromDropDown(){
        log.info("Select option from drop down");
        selectByVisibleTextFromDropDown(searchCustomer,"Harry Potter");
    }
    public void clickOnLoginButton(){
        log.info("Click on login button "+login.toString());
        clickOnElement(login);
    }
    public String verifyLogOutText(){
        log.info("Verify logout text "+logout.toString());
        return getTextFromElement(logout);
    }
    public void clickOnLogoutButton(){
        log.info("Click on logout button "+logout.toString());
        clickOnElement(logout);
    }
    public String verifyYourNameText(){
        log.info("Verify text "+yourNameMessage.toString());
        return getTextFromElement(yourNameMessage);
    }


}
