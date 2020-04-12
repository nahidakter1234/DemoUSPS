$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("uspshomepage.feature");
formatter.feature({
  "line": 2,
  "name": "land on homepage and continue to address change",
  "description": "",
  "id": "land-on-homepage-and-continue-to-address-change",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 5134625400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Address change",
  "description": "",
  "id": "land-on-homepage-and-continue-to-address-change;address-change",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "From tools menu change address",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "land on address change page",
  "keyword": "Then "
});
formatter.match({
  "location": "UspsAddChangeSteps.be_on_Homepage()"
});
formatter.result({
  "duration": 2657300600,
  "status": "passed"
});
formatter.match({
  "location": "UspsAddChangeSteps.on_homepage_from_tools_menu_change_address()"
});
formatter.result({
  "duration": 317800,
  "error_message": "java.lang.Error: Unresolved compilation problem: \n\tThe method changeaddress() is undefined for the type UspsAddChangeActions\n\r\n\tat walmart.StepDef.UspsAddChangeSteps.on_homepage_from_tools_menu_change_address(UspsAddChangeSteps.java:20)\r\n\tat ✽.When From tools menu change address(uspshomepage.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UspsAddChangeSteps.land_on_address_change_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 113600,
  "status": "passed"
});
});