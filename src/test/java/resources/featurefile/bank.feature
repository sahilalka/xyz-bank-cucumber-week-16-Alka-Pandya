Feature: Bank Test
  As a user I want to login into xyz bank website
  Background:
    Given  I am on homepage
  @sanity @regression
  Scenario: bankManager Should Add Customer Successfully
    When   I click On "Bank Manager Login" Tab
    And    I click On the "Add Customer" Tab
    And    I enter FirstName
    And    I enter LastName
    And    I enter PostCode
    And    I click On "Add Customer" Button
    And    I see popup displayed
    Then   I verify message "Customer added successfully"
    And    I click on "ok" button on popup

  @smoke @regression
  Scenario: bankManager Should Open Account Successfully
    When   I click On "Bank Manager Login" Tab
    And    I click On the "Open Account" Button
    And    I Search customer that created in first test
    And    I Select currency "Pound"
    And    I click on "process" button1
    And    I see popup displayed
    Then    I verify the message "Account created successfully"
    And    I click on "ok" button on popup

  @regression
  Scenario: customer Should Login And Logout Successfully
    When  I click on "Customer Login" customer login Tab
    And   I search customer that I created
    And   I click on "Login" login Button
    And   I verify "Logout" Tab displayed
    And   I click on "Logout" logout Button
    Then   I verify "Your Name" text displayed

  @regression
  Scenario: customer Should Deposit Money Successfully
    When  I click on "Customer Login" customer login Tab
    And   I search customer that I created
    And   I click on "Login" login Button
    And   I click on "Deposit" Tab on page
    And   I Enter amount 100
    And   I click on "Deposit" Button on the page
    Then  I verify message ""Deposit Successful"" on the page

  @regression
  Scenario: Customer should withdraw money successfully
    When  I click on "Customer Login" customer login Tab
    And   I search customer that I created
    And   I click on "Login" login Button
    And   I click on "Deposit" Tab on page
    And   I Enter amount 100
    And   I click on the "Withdrawl" Tab on page
    And   I Enter amount 50 on the page
    And   I click next on "Withdraw" Button
    Then  I verify that message "Transaction Successful"




