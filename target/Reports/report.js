$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources/Fleet.feature");
formatter.feature({
  "line": 1,
  "name": "Fleet",
  "description": "",
  "id": "fleet",
  "keyword": "Feature"
});
formatter.before({
  "duration": 191874,
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
formatter.write("\n08/02/19 01:13:21 INFO: Successfully navigated to http://qa3.vytrack.com/");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 3059999286,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Verify default order",
  "description": "",
  "id": "fleet;verify-default-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I login as \"Store manager\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I mouseover \"Fleet\" dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click \"Vehicles\" option",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click \"License Plate\" from all cars table",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I verify all records in \"License Plate\" in \"ascending\" order",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click \"License Plate\" from all cars table",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I verify all records in \"License Plate\" in \"descending\" order",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Store manager",
      "offset": 12
    }
  ],
  "location": "MyStepdefs.iLoginAs(String)"
});
formatter.write("\n08/02/19 01:13:25 INFO: Entered the credentials ");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 10811932876,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fleet",
      "offset": 13
    }
  ],
  "location": "MyStepdefs.iMouseoverDropdown(String)"
});
formatter.write("\n08/02/19 01:13:36 INFO: Successfully mouseovered to Fleet");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 4171478853,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vehicles",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iClickOption(String)"
});
formatter.write("\n08/02/19 01:13:42 INFO: Element is displayed");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "duration": 6137213550,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "License Plate",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iClickFromAllCarsTable(String)"
});
formatter.result({
  "duration": 2089874429,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "License Plate",
      "offset": 25
    },
    {
      "val": "ascending",
      "offset": 44
    }
  ],
  "location": "MyStepdefs.iVerifyAllRecordsInInOrder(String,String)"
});
formatter.write("\n08/02/19 01:13:45 INFO: All values are in ascending order as expected: [11318, 13478, 21432, 56432]");
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "duration": 493538094,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "License Plate",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iClickFromAllCarsTable(String)"
});
formatter.result({
  "duration": 2069702131,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "License Plate",
      "offset": 25
    },
    {
      "val": "descending",
      "offset": 44
    }
  ],
  "location": "MyStepdefs.iVerifyAllRecordsInInOrder(String,String)"
});
formatter.write("\n08/02/19 01:13:47 INFO: All values are in descending order as expected: [56432, 21432, 13478, 11318]");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "duration": 492566399,
  "status": "passed"
});
formatter.after({
  "duration": 151500042,
  "status": "passed"
});
});