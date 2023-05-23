package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='openAccount()']")
    WebElement openAccount;

    @CacheLookup
    //@FindBy(id = "userSelect")
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;


    @CacheLookup
    @FindBy(id = "currency")
    WebElement currency;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement processBtn;

    public void clickOnOpenAccount(){
        log.info("Click on open account "+openAccount.toString());
        clickOnElement(openAccount);

    }

    //    public void clickCustomerFromDropDown() throws InterruptedException {
//        Thread.sleep(2000);
//
//        //selectOptionByIndex(customerNameDropdown,6);
//        //selectOptionsByContainText(customerNameDropdown,"Krish Patel");
//        log.info("Select customer name from dropdown "+customerNameDropdown.toString());
//        selectByVisibleTextFromDropDown(customerNameDropdown,"Krish");
//    }
    public void searchCustomer(){
        //selectByVisibleTextFromDropDown(searchCustomer, "Harry");
        selectByIndexFromDropDown(searchCustomer, 2);
    }
    public void selectCurrencyPoundFromDropDown(){
        log.info("Select currency from dropdown "+currency.toString());
        selectByVisibleTextFromDropDown(currency,"Pound");
    }

    public void clickOnProcessButton(){
        log.info("Click on process button "+processBtn.toString());
        clickOnElement(processBtn);
    }
    public String getSuccessfulTextFromPopup(){
        log.info("Get text from alert");
        return getTextFromAlert();
    }

    public void clickOkOnPopup(){
        log.info("Click ok fro alert");
        acceptAlert();
    }


}
