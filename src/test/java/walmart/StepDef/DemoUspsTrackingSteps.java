package walmart.StepDef;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import walmart.PageActions.UspsAddChangeActions;
import walmart.PageElements.UspsAddChangeLocators;

public class DemoUspsTrackingSteps {
	UspsAddChangeLocators UspsAddChangeLocatorsobj= new UspsAddChangeLocators();
	UspsAddChangeActions UspsAddChangeActionsobj= new UspsAddChangeActions();
	
@Given("^User on Homepage$")	
public void user_on_Homepage(){
	UspsAddChangeActionsobj.launchUspshomepage();
}

@When("^User provides a tracking \"([^\"]*)\"$")
public void user_provides_a_tracking(String Number) throws Throwable {
	UspsAddChangeActionsobj.Hovermethod(Number);
}

@When("^Looks for package information$")
public void looks_for_information() throws Throwable {
   System.out.println("Looking for a match");
}

@Then("^User gets tracking information$")
public void user_gets_tracking_information() throws Throwable {
	 UspsAddChangeActionsobj.CheckTracking();
}
}
