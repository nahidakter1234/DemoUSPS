package walmart.Utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	@Before
	public void beforeAction(Scenario scen){
		System.out.println(">> Initializing Chrome Driver");
	SetupDriver.setupDriver();
		System.out.println(scen.getName());
		
	}
}
