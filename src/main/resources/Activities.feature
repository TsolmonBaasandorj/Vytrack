Feature: Activities
  Background:
    Given I navigate to "http://qa3.vytrack.com/"

  Scenario: Menu options for driver-1
    And I enter "Driver" credentials to userName and Password textbox
    And I mouseover "Activities" dropdown
    And I click "Calendar Events" option
    And I verify the page name of "Calendar Events"
    Then I verify the page title of "Calendar Events - Activities"


    Scenario: Menu options for storeManager-1
      And I enter "Store manager" credentials to userName and Password textbox
      And I mouseover "Activities" dropdown
      And I click "Calls" option
      And I verify the page name of "All Calls"
      Then I verify the page title of "All - Calls - Activities"
   And i chooce "dfgjsdfg"
    Scenario: Menu options for storeManager-2
      And I enter "Store manager" credentials to userName and Password textbox
      And I mouseover "Activities" dropdown
      And I click "Calendar Events" option
      And I verify the page name of "All Calendar Events"
      Then I verify the page title of "All - Calendar Events - Activities"