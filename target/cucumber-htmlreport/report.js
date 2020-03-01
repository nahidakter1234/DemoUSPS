$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("clothingaccsshopall.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want to be able to see shop all page",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-see-shop-all-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2986285900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User lands on Shop All page",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-see-shop-all-page;user-lands-on-shop-all-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User selects clothing, shoes and accessories",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User selects Shop All option",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify Landing",
  "keyword": "Then "
});
formatter.match({
  "location": "ClothingAccShopAllStep.user_is_on_Homepage()"
});
formatter.result({
  "duration": 7487606400,
  "status": "passed"
});
formatter.match({
  "location": "ClothingAccShopAllStep.user_selects_clothing_shoes_and_accessories()"
});
formatter.result({
  "duration": 279800,
  "error_message": "java.lang.NullPointerException\r\n\tat walmart.PageActions.ClothingAccShopAllActions.sparkmenu(ClothingAccShopAllActions.java:17)\r\n\tat walmart.StepDef.ClothingAccShopAllStep.user_selects_clothing_shoes_and_accessories(ClothingAccShopAllStep.java:23)\r\n\tat ✽.When User selects clothing, shoes and accessories(clothingaccsshopall.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ClothingAccShopAllStep.user_selects_Shop_All_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ClothingAccShopAllStep.verify_landing()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 668421900,
  "status": "passed"
});
});