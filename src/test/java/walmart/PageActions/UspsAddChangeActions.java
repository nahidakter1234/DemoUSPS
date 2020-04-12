package walmart.PageActions;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import walmart.PageElements.UspsAddChangeLocators;
import walmart.Utilities.SetupDriver;

public class UspsAddChangeActions {
	UspsAddChangeLocators UspsAddChangeLocatorsobj;
	
	public UspsAddChangeActions(){
		UspsAddChangeLocatorsobj= new UspsAddChangeLocators();
		PageFactory.initElements(SetupDriver.driver, UspsAddChangeLocatorsobj);

	}
	
public void launchUspshomepage(){
	SetupDriver.driver.get("https://www.usps.com/");
	SetupDriver.driver.manage().window().maximize();
	SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
 

	
public void Hovermethod(String Number){
//	Actions action= new Actions(driver);
//	action.moveToElement(Quicktools).perform();	
//	action.moveToElement(AddChange).click();
//	action.moveToElement(Individual).click();
	
	UspsAddChangeLocatorsobj.SearchBtn.sendKeys(Number);
	UspsAddChangeLocatorsobj.Search.click();
	
	}

public void CheckTracking(){
	Assert.assertEquals("Your search - 07710600 - did not match any documents", "Your search - 07710600 - did not match any documents");
	System.out.println("~~ No such Tracking Number~~");
	
}
	
	
}




	

