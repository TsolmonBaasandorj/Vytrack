Feature: Dashboard
  Background:
    Given I navigate to "http://qa3.vytrack.com/"

   @smoke
  Scenario: Menu options , store manager
     And I login as "Store manager"
    And I mouseover "Dashboards" dropdown
    And I click "Dashboard" option
    And I verify the page name of "Dashboard"
    Then I verify the page title of "Dashboard - Dashboards"

