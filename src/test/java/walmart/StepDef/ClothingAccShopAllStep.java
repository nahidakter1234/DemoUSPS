package walmart.StepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import walmart.PageActions.ClothingAccShopAllActions;
import walmart.PageElements.ClothingAccShopAllLocator;

public class ClothingAccShopAllStep {
	ClothingAccShopAllLocator ClothingAccShopAllLocatorobj = new ClothingAccShopAllLocator();
	ClothingAccShopAllActions ClothingAccShopAllActionsobj = new ClothingAccShopAllActions();

@Given("^User is on Homepage$")
public void user_is_on_Homepage() throws Throwable {
	 ClothingAccShopAllActionsobj.launchwalmartpage();
	 
	 
}

@When("^User selects clothing, shoes and accessories$")
public void user_selects_clothing_shoes_and_accessories() throws Throwable {
	ClothingAccShopAllActionsobj.sparkmenu();

}

@And("^User selects Shop All option$")
public void user_selects_Shop_All_option() throws Throwable {
	ClothingAccShopAllActionsobj.clothingshoes();
	
}
@Then("^Verify Landing$")
public void verify_landing() throws Throwable {
	System.out.println("LANDED");
}
}
