Feature: Fleet
  Background:
    Given I navigate to "http://qa3.vytrack.com/"

  Scenario: Menu options for driver-1
    And I login as "Driver"
    And I mouseover "Fleet" dropdown
    And I click "Vehicles" option
    And I verify the page name of "Cars"
    And I verify the page title of "Car - Entities - System - Car - Entities - System"


  Scenario: Menu options , store manager
    And I login as "Store manager"
    And I mouseover "Fleet" dropdown
    And I click "Vehicles" option
    And I verify the page name of "All Cars"
    Then I verify the page title of "All - Car - Entities - System - Car - Entities - System"


  Scenario: Verify default order
    And I login as "Store manager"
    And I mouseover "Fleet" dropdown
    And I click "Vehicles" option
    And I click "License Plate" from all cars table
    And I verify all records in "License Plate" in "ascending" order
    And I click "License Plate" from all cars table
    And I verify all records in "License Plate" in "descending" order

    Scenario: Verify that all records that are displayed can be stores
      And I login as "Driver"
      And I mouseover "Fleet" dropdown
      And I click "Vehicles" option
      And I click "Driver" from all cars table
      And I verify all records in "Driver" in "ascending" order
      And I click "Driver" from all cars table
      And I verify all records in "Driver" in "descending" order

      Scenario: Select all checkbox
        And I login as "Driver"
        And I mouseover "Fleet" dropdown
        And I click "Vehicles" option
