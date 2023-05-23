package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='deposit()']")
    WebElement deposit;
    // By deposit = By.xpath("//button[@ng-click='deposit()']");

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement depositAmount;
    // By depositAmount = By.xpath("//input[@placeholder='amount']");

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement finalDeposit;
    // By finalDeposit = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositSuccessfulMessage;
    // By depositSuccessfulMessage=By.xpath("//span[contains(text(),'Deposit Successful')]");

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawlTab;
    // By withdrawlButton=By.xpath("//button[@ng-click='withdrawl()']");

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountWithdrawlField;
    // By amountWithdrawlField=By.xpath("//input[@placeholder='amount']");

    @CacheLookup
    // @FindBy(xpath = "//button[contains(text(),'Withdraw')and@type='submit']")
    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement withdrawButton1;
    // By withdrawButton1=By.xpath("//button[contains(text(),'Withdraw')and@type='submit']");

    @CacheLookup
    //@FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement withdrawlText;
    //By transactionMessage=By.xpath("//span[contains(text(),'Transaction successful')]");

    public void clickOnDepositButton() {
        log.info("click on deposit button " + deposit.toString());
        clickOnElement(deposit);
    }

    public void enterAmountIntoDepositFeild(String num) {
        log.info("Enter amount : " + depositAmount.toString());
        sendTextToElement(depositAmount, num);
    }

    public void clickOnDepositButtonAfterEnterAmount() {
        log.info("Click on deposit button " + finalDeposit.toString());
        clickOnElement(finalDeposit);
    }

    public String verifyDepositSuccessfulMessage() {
        log.info("Verify message : " + depositSuccessfulMessage.toString());
        return getTextFromElement(depositSuccessfulMessage);
    }

    public void clickOnWithdrawlTab() {
        log.info("Click on withdrawl tab " + withdrawlTab.toString());
        clickOnElement(withdrawlTab);
    }

    public void enterAmountYouWishToWithdrawl(String amount) {
        log.info("Enter amount " + amountWithdrawlField.toString());
        sendTextToElement(amountWithdrawlField, amount);
    }

    public void clickOnWithdrawlButtonAfterEnterAmount() {
        log.info("click on withdrawl Button " + withdrawButton1.toString());
        clickOnElement(withdrawButton1);
    }

    public String verifyTransactionSuccessfulMessage() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Transaction message " + withdrawlText.toString());
        return getTextFromElement(withdrawlText);
    }

}
