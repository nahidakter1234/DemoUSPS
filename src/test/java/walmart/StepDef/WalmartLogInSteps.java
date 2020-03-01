package walmart.StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import walmart.PageActions.WalmartLogInActions;


public class WalmartLogInSteps {

	WalmartLogInActions WalmartLogInActionsobj = new WalmartLogInActions();
	
	@Given("^Browse to Walmart homepage$")
	public void browse_to_Walmart_homepage() throws Throwable {
		WalmartLogInActionsobj.launchWalmartSignInpage(); 
		WalmartLogInActionsobj.SignIn();
	}

	@When("^User provide correct “<Username>” and “<Password>”$")
	public void user_provide_correct_Username_and_Password(String Username,String Password) throws Throwable {
	WalmartLogInActionsobj.Username(Username);
	WalmartLogInActionsobj.Password(Password);
	
	}
	

	@Then("^Verify login$")
	public void verify_login() throws Throwable {
	    System.out.println(" ***I AM AWESOME**");
	}


}
