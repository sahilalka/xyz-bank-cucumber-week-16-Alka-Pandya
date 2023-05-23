package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomer;


    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Add Customer']")
    WebElement addCustomer1;

    public void clickOnAddCustomerButton () {
        log.info("Click on addCustomer button : "+addCustomer.toString());
        clickOnElement(addCustomer);
    }
    public void enterFirstName(String name) {
        log.info("Enter first name : "+firstName.toString());
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String name) {
        log.info("Enter last name : "+lastName.toString());
        sendTextToElement(lastName, name);
    }

    public void enterPostCode(String code){
        log.info("Enter postcode : "+postCode.toString());
        sendTextToElement(postCode,code);
    }

    public void clickOnAddCustomerButtonAfterEnterInformation(){
        log.info("Click on add customer button : "+addCustomer1.toString());
        clickOnElement(addCustomer1);
    }
    public String verifyReceivedTextFromPopup(){
        return getTextFromAlert();

    }

    public void clickOkOnPopup(){
        acceptAlert();
    }


}
