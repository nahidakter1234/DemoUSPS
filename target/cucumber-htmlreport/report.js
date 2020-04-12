$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DemoUspsTracking.feature");
formatter.feature({
  "line": 2,
  "name": "USPS Tracking",
  "description": "",
  "id": "usps-tracking",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Search for a tracking Number",
  "description": "",
  "id": "usps-tracking;search-for-a-tracking-number",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User provides a tracking \"\u003cNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Looks for package information",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User gets tracking information",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "usps-tracking;search-for-a-tracking-number;",
  "rows": [
    {
      "cells": [
        "Number"
      ],
      "line": 11,
      "id": "usps-tracking;search-for-a-tracking-number;;1"
    },
    {
      "cells": [
        "07710600"
      ],
      "line": 12,
      "id": "usps-tracking;search-for-a-tracking-number;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2826112400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Search for a tracking Number",
  "description": "",
  "id": "usps-tracking;search-for-a-tracking-number;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User provides a tracking \"07710600\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Looks for package information",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User gets tracking information",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoUspsTrackingSteps.user_on_Homepage()"
});
formatter.result({
  "duration": 3038966600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "07710600",
      "offset": 26
    }
  ],
  "location": "DemoUspsTrackingSteps.user_provides_a_tracking(String)"
});
formatter.result({
  "duration": 234800900,
  "status": "passed"
});
formatter.match({
  "location": "DemoUspsTrackingSteps.looks_for_information()"
});
formatter.result({
  "duration": 79000,
  "status": "passed"
});
formatter.match({
  "location": "DemoUspsTrackingSteps.user_gets_tracking_information()"
});
formatter.result({
  "duration": 2229800,
  "status": "passed"
});
formatter.after({
  "duration": 717745400,
  "status": "passed"
});
});