Feature: Login_navigation
  Background:
    Given I navigate to "http://qa3.vytrack.com/"

  Scenario: Login test, store manager
    And I enter "Store manager" credentials to userName and Password textbox
    And I verify "Devante Kilback" is displayed on top right
    And I verify "Dashboard" page is open
    And I log out

  Scenario: Login test, sales manager
    And I enter "Sales manager" credentials to userName and Password textbox
    And I verify "Camila Weissnat" is displayed on top right
    And I verify "Dashboard" page is open
    And I log out

  Scenario: Login test, driver
    And I enter "Driver" credentials to userName and Password textbox
    And I verify "Toney Hegmann" is displayed on top right
    And I verify "Quick Launchpad" page is open
    And I log out

    Scenario: Login negative test
      And I enter "user10" to usernameTextBox
      And I enter "useruser" to passwordTextBox
      And I click login button
      And I should see "Invalid user name or password" message
      And I verify "Login" title
      And I verify "http://qa3.vytrack.com/user/login" url
