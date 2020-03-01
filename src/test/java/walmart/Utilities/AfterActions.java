package walmart.Utilities;


import cucumber.api.java.After;

public class AfterActions {
	@After
	public void afterAction(){
		SetupDriver.tearDownDriver();
		System.out.println("----------");
	}

}
