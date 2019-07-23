$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Dashboards.feature");
formatter.feature({
  "line": 1,
  "name": "Dashboard",
  "description": "",
  "id": "dashboard",
  "keyword": "Feature"
});
formatter.before({
  "duration": 207598,
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
  "duration": 2142913769,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Menu options , store manager",
  "description": "",
  "id": "dashboard;menu-options-,-store-manager",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
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
  "name": "I mouseover \"Dashboards\" dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click \"Dashboard\" option",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify the page name of \"Dashboard\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify the page title of \"Dashboard - Dashboards\"",
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
  "duration": 4378185381,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboards",
      "offset": 13
    }
  ],
  "location": "MyStepdefs.iMouseoverDropdown(String)"
});
formatter.result({
  "duration": 2107994802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iClickOption(String)"
});
formatter.result({
  "duration": 4070273676,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard",
      "offset": 27
    }
  ],
  "location": "MyStepdefs.iVerifyThePageTitleOf(String)"
});
formatter.result({
  "duration": 9540728,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard - Dashboards",
      "offset": 28
    }
  ],
  "location": "MyStepdefs.iVerifyThePageNameOf(String)"
});
formatter.result({
  "duration": 3011871705,
  "status": "passed"
});
formatter.after({
  "duration": 130641561,
  "status": "passed"
});
formatter.uri("Sales.feature");
formatter.feature({
  "line": 1,
  "name": "Sales",
  "description": "",
  "id": "sales",
  "keyword": "Feature"
});
formatter.before({
  "duration": 35535,
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
  "duration": 1438471388,
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
  "name": "I verify the page title of \"Open Opportunities - Opportunities - Sales\"",
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
  "duration": 4101943085,
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
  "duration": 2044917360,
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
  "duration": 35062220,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not interactable\n  (Session info: chrome\u003d75.0.3770.142)\n  (Driver info: chromedriver\u003d2.46.628411 (3324f4c8be9ff2f70a05a30ebc72ffb013e1a71e),platform\u003dMac OS X 10.13.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 16 milliseconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027Khaliunaas-MacBook-Pro.local\u0027, ip: \u002710.0.0.138\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:50276}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.46.628411 (3324f4c8be9ff2f70a05a30ebc72ffb013e1a71e), userDataDir\u003d/var/folders/k1/nrhxv32n0zn6vgv6zc8y63br0000gp/T/.org.chromium.Chromium.8drY7w}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d75.0.3770.142, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 1c3a33351f8b6f91058fd7642baf0f0e\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\n\tat Impls.CommonImpls.clickElement(CommonImpls.java:47)\n\tat Step_definition.MyStepdefs.iClickOption(MyStepdefs.java:35)\n\tat ✽.And I click \"Opportunities\" option(Sales.feature:9)\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Open Opportunities - Opportunities - Sales",
      "offset": 28
    }
  ],
  "location": "MyStepdefs.iVerifyThePageNameOf(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 134126848,
  "status": "passed"
});
});