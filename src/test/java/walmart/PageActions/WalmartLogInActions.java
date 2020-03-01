package walmart.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import walmart.PageElements.WalmartLogInLocators;
import walmart.Utilities.SetupDriver;

public class WalmartLogInActions {
	
	WalmartLogInLocators WalmartLogInLocatorsobj = new WalmartLogInLocators();

	public WalmartLogInActions(){
		WalmartLogInLocatorsobj = new WalmartLogInLocators();
		PageFactory.initElements(SetupDriver.driver, WalmartLogInLocatorsobj);
	}

	public void launchWalmartSignInpage(){
	SetupDriver.driver.get("https://www.walmart.com/");
	SetupDriver.driver.manage().window().maximize();
	SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	public void SignIn(){
	WalmartLogInLocatorsobj.Account.click();
	WalmartLogInLocatorsobj.SignIn.click();
	}
	
	public void Username(String username){
	WalmartLogInLocatorsobj.username.sendKeys(username);
	}
	public void Password(String password){
	WalmartLogInLocatorsobj.password.sendKeys(password);
	
}
}