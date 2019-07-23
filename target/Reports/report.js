$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sales.feature");
formatter.feature({
  "line": 1,
  "name": "Sales",
  "description": "",
  "id": "sales",
  "keyword": "Feature"
});
formatter.before({
  "duration": 132280,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I navigate to \"http://qa3.vytrack.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qa3.vytrack.com/",
      "offset": 15
    }
  ],
  "location": "MyStepdefs.iNavigateTo(String)"
});
formatter.result({
  "duration": 2126505542,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Menu options , store manager",
  "description": "",
  "id": "sales;menu-options-,-store-manager",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I enter \"Store manager\" credentials to userName and Password textbox",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I mouseover \"Sales\" dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click \"Opportunities\" option",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify the page name of \"Open Opportunities\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify the page title of \"Tsoomoo\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Store manager",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterCredentialsToUserNameAndPasswordTextbox(String)"
});
formatter.result({
  "duration": 4917273024,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sales",
      "offset": 13
    }
  ],
  "location": "MyStepdefs.iMouseoverDropdown(String)"
});
formatter.result({
  "duration": 2052720720,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Opportunities",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iClickOption(String)"
});
formatter.result({
  "duration": 4068723855,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Open Opportunities",
      "offset": 27
    }
  ],
  "location": "MyStepdefs.iVerifyThePageTitleOf(String)"
});
formatter.result({
  "duration": 11359222,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tsoomoo",
      "offset": 28
    }
  ],
  "location": "MyStepdefs.iVerifyThePageNameOf(String)"
});
formatter.result({
  "duration": 3013214031,
  "error_message": "java.lang.AssertionError: expected [Open Opportunities - Opportunities - Sales] but found [Tsoomoo]\n\tat org.testng.Assert.fail(Assert.java:94)\n\tat org.testng.Assert.failNotEquals(Assert.java:494)\n\tat org.testng.Assert.assertEquals(Assert.java:123)\n\tat org.testng.Assert.assertEquals(Assert.java:176)\n\tat org.testng.Assert.assertEquals(Assert.java:186)\n\tat Impls.CommonImpls.verifyPageName(CommonImpls.java:63)\n\tat Step_definition.MyStepdefs.iVerifyThePageNameOf(MyStepdefs.java:45)\n\tat ✽.Then I verify the page title of \"Tsoomoo\"(Sales.feature:11)\n",
  "status": "failed"
});
formatter.after({
  "duration": 148694561,
  "status": "passed"
});
});