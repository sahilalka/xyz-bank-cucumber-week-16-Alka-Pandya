package com.bank.steps;

import com.bank.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BankSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click On \"([^\"]*)\" Tab$")
    public void iClickOnTab(String arg0){
        new HomePage().clickOnBankManagerLoginButton();
    }
    @And("^I click On the \"([^\"]*)\" Tab$")
    public void iClickOnTheTab(String arg0) {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @And("^I enter FirstName$")
    public void iEnterFirstName() {
        new AddCustomerPage().enterFirstName("Krish");
    }

    @And("^I enter LastName$")
    public void iEnterLastName() {
        new AddCustomerPage().enterLastName("Patel");
    }

    @And("^I enter PostCode$")
    public void iEnterPostCode() {
        new AddCustomerPage().enterPostCode("Ha3 8LU");
    }

    @And("^I click On \"([^\"]*)\" Button$")
    public void iClickOnButton(String arg0) {
        new AddCustomerPage().clickOnAddCustomerButtonAfterEnterInformation();
    }
    @And("^I see popup displayed$")
    public void iSeePopupDisplayed() {

    }
    @Then("^I verify message \"([^\"]*)\"$")
    public void iVerifyMessage(String arg0) {
        new AddCustomerPage().verifyReceivedTextFromPopup();
        Assert.assertEquals(new AddCustomerPage().verifyReceivedTextFromPopup(),"Customer added successfully with customer id :6");
    }

    @And("^I click on \"([^\"]*)\" button on popup$")
    public void iClickOnButtonOnPopup(String arg0){
        new AddCustomerPage().clickOkOnPopup();

    }

    @And("^I click On the \"([^\"]*)\" Button$")
    public void iClickOnTheButton(String arg0){
        new OpenAccountPage().clickOnOpenAccount();
    }

    @And("^I Search customer that created in first test$")
    public void iSearchCustomerThatCreatedInFirstTest() throws InterruptedException {
        new OpenAccountPage().searchCustomer();
    }
    @And("^I Select currency \"([^\"]*)\"$")
    public void iSelectCurrency(String arg0){
        new OpenAccountPage().selectCurrencyPoundFromDropDown();

    }
    @And("^I click on \"([^\"]*)\" button(\\d+)$")
    public void iClickOnButton(String arg0, int arg1){
        new OpenAccountPage().clickOnProcessButton();
    }

    @And("^I verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String arg0){
        new OpenAccountPage().getSuccessfulTextFromPopup();
        Assert.assertEquals(new OpenAccountPage().getSuccessfulTextFromPopup(), "Account created successfully with account Number :1016");
    }
    @And("^I click on the \"([^\"]*)\" button on popup\\.$")
    public void iClickOnTheButtonOnPopup(String arg0){
        new AddCustomerPage().clickOkOnPopup();
    }

    @When("^I click on \"([^\"]*)\" customer login Tab$")
    public void iClickOnCustomerLoginTab(String arg0){
        new HomePage().clickOnCustomerLoginButton();
    }

    @And("^I search customer that I created$")
    public void iSearchCustomerThatICreated() throws InterruptedException {
        new CustomerLoginPage().searchCustomerName();
    }

    @And("^I click on \"([^\"]*)\" login Button$")
    public void iClickOnLoginButton(String arg0){
        new CustomerLoginPage().clickOnLoginButton();
    }


    @And("^I verify \"([^\"]*)\" Tab displayed$")
    public void iVerifyTabDisplayed(String arg0){
        Assert.assertEquals(new CustomerLoginPage().verifyLogOutText(), "Logout");
    }

    @And("^I click on \"([^\"]*)\" logout Button$")
    public void iClickOnLogoutButton(String arg0){
        new CustomerLoginPage().clickOnLogoutButton();
    }

    @And("^I verify \"([^\"]*)\" text displayed$")
    public void iVerifyTextDisplayed(String arg0){
        Assert.assertEquals(new CustomerLoginPage().verifyYourNameText(), "Your Name :");
    }


    @And("^I click on \"([^\"]*)\" Tab on page$")
    public void iClickOnTabOnPage(String arg0){
        new AccountPage().clickOnDepositButton();
    }

    @And("^I Enter amount (\\d+)$")
    public void iEnterAmount(int arg0) {
        new AccountPage().enterAmountIntoDepositFeild("100");
    }

    @And("^I click on \"([^\"]*)\" Button on the page$")
    public void iClickOnButtonOnThePage(String arg0){
        new AccountPage().clickOnDepositButtonAfterEnterAmount();
    }
    @Then("^I verify message \"([^\"]*)\"Deposit Successful\"([^\"]*)\" on the page$")
    public void iVerifyMessageDepositSuccessfulOnThePage(String arg0, String arg1){
        Assert.assertEquals(new AccountPage().verifyDepositSuccessfulMessage(), "Deposit Successful");
    }

    @And("^I click on the \"([^\"]*)\" Tab on page$")
    public void iClickOnTheTabOnPage(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        new AccountPage().clickOnWithdrawlTab();

    }

    @And("^I Enter amount (\\d+) on the page$")
    public void iEnterAmountOnThePage(int arg0) throws InterruptedException {
        Thread.sleep(2000);
        new AccountPage().enterAmountYouWishToWithdrawl("50");
    }

    @And("^I click next on \"([^\"]*)\" Button$")
    public void iClickNextOnButton(String arg0){
        new AccountPage().clickOnWithdrawlButtonAfterEnterAmount();
    }

    @Then("^I verify that message \"([^\"]*)\"$")
    public void iVerifyThatMessage(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(new AccountPage().verifyTransactionSuccessfulMessage(),"Transaction successful","error message displayed");


    }

}
