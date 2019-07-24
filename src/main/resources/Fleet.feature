Feature: Fleet
  Background:
    Given I navigate to "http://qa3.vytrack.com/"

  Scenario: Menu options for driver-1
    And I enter "Driver" credentials to userName and Password textbox
    And I mouseover "Fleet" dropdown
    And I click "Vehicles" option
    And I verify the page name of "Cars"
    And I verify the page title of "Car - Entities - System - Car - Entities - System"


  Scenario: Menu options , store manager
    And I enter "Store manager" credentials to userName and Password textbox
    And I mouseover "Fleet" dropdown
    And I click "Vehicles" option
    And I verify the page name of "All Cars"
    Then I verify the page title of "All - Car - Entities - System - Car - Entities - System"


