Feature: Customer

  Background:
    Given I navigate to "http://qa3.vytrack.com/"

@Mine
  Scenario: Menu options for driver-1
    And I login as "Driver"
    And I mouseover "Customers" dropdown
    And I click "Accounts" option
    And I verify the page name of "Acnts"
#    Then I verify the page title of "Contacts - Customers"

  Scenario: Menu options for driver-2
    And I login as "Driver"
    And I mouseover "Customers" dropdown
    And I click "Contacts" option
    And I verify the page name of "Contacts"
    Then I verify the page title of "Contacts - Customers"

  Scenario: Menu options for storeManager-1
    And I login as "Store manager"
    And I mouseover "Customers" dropdown
    And I click "Accounts" option
    And I verify the page name of "All Accounts"
    Then I verify the page title of "All - Accounts - Customers"

  Scenario: Menu options for storeManager-2
    And I login as "Driver"
    And I mouseover "Customers" dropdown
    And I click "Contacts" option
    And I verify the page name of "Contacts"
    Then I verify the page title of "Contacts - Customers"