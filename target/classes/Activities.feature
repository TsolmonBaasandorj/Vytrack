Feature: Activities

  Background:
    Given I navigate to "http://qa3.vytrack.com/"

    @Test
  Scenario: Menu options for driver-1
    And I login as "Driver"
    And I mouseover "Activities" dropdown
    And I click "Calendar Events" option
    And I verify the page name of "Calendar Events"
    Then I verify the page title of "Calendar Events - Activities"


  Scenario: Menu options for storeManager-1
    And I login as "Store manager"
    And I mouseover "Activities" dropdown
    And I click "Calls" option
    And I verify the page name of "All Calls"
    Then I verify the page title of "All - Calls - Activities"

  Scenario: Menu options for storeManager-2
    And I login as "Store manager"
    And I mouseover "Activities" dropdown
    And I click "Calendar Events" option
    And I verify the page name of "All Calendar Events"
    Then I verify the page title of "All - Calendar Events - Activities"


  Scenario: Date Test
    And I login as "Store manager"
    And I mouseover "Activities" dropdown
    And I click "Calendar Events" option
    And I click "Create Calendar event" option
    And I choose "Choose a date" textBox from "Start"
    And I change date to "Aug", "2020", "15"
    And I verify "End Date" is "Aug 15, 2020"
    And I choose "Choose a date" textBox from "Start"
    And I change date to "Jul", "2019", "28"
    And I verify "End Date" is "Jul 28, 2019"

  Scenario: Time test 1
    And I login as "Store manager"
    And I mouseover "Activities" dropdown
    And I click "Calendar Events" option
    And I click "Create Calendar event" option
    And I choose "time" textBox from "Start"
    And I change time to "8:30 PM"
    And I verify "End Time" is "9:30 PM"

  Scenario: Time test 2
    And I login as "Store manager"
    And I mouseover "Activities" dropdown
    And I click "Calendar Events" option
    And I click "Create Calendar event" option
    And I choose "time" textBox from "Start"
    And I change time to "3:00 PM"
    And I verify "End Time" is "4:00 PM"

  Scenario: Time test 3
    And I login as "Store manager"
    And I mouseover "Activities" dropdown
    And I click "Calendar Events" option
    And I choose "time" textBox from "Start"
    And I change time to "11:30 PM"
    And I verify "End Time" is "12:30 AM"

  Scenario: Daily repeat test
    And I login as "Store manager"
    And I mouseover "Activities" dropdown
    And I click "Calendar Events" option
    And I click "Create Calendar event" option
    And I click repeat checkbox
    And I verify "Daily" is selected by default
    And I verify day(s) checkbox is selected
    And I verify default value  is "1"
    And I verify summary says "Daily every 1 day"

  Scenario: Daily repeat, error message
    And I login as "Store manager"
    And I mouseover "Activities" dropdown
    And I click "Calendar Events" option
    And I click "Create Calendar event" option
    And I click repeat checkbox
    And I clear the textBox
    And I enter "1000" to day(s) textbox
    And I verify summary says "The value have not to be more than 99."
   # And I clear the textBox
    #And I enter "0" to day(s) textbox
    #And I verify summary says "null"

  Scenario: Daily repeat , functionality
    And I login as "Store manager"
    And I mouseover "Activities" dropdown
    And I click "Calendar Events" option
    And I click "Create Calendar event" option
    And I click repeat checkbox
    And I clear the textBox
    And I enter "55" to day(s) textbox
    And I verify summary says "Daily every 55 days"
#      And I clear the textBox
#      And I enter "99" to day(s) textbox
#      And I verify summary says "Daily every 99 days"


#  Scenario Outline: test
#    When I login as <userType>
#    Then I validate that i am in the homepage
#
#    Examples:
#      | userType      |
#      | truck driver  |
#      | sales manager |
#
#
#  Scenario: tets
#    When I validate following:
#      | Customers  | account  |
#      | Activities | manageer |


