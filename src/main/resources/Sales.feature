Feature: Sales
  Background:
    Given I navigate to "http://qa3.vytrack.com/"

    @smoke @regression
  Scenario: Menu options , store manager
    And I enter "Store manager" credentials to userName and Password textbox
    And I mouseover "Sales" dropdown
    And I click "Opportunities" option
    And I verify the page name of "Open Opportunities"
    Then I verify the page title of "Open Opportunities - Opportunities - Sales"

