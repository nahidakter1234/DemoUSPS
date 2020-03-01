package walmart.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalmartLogInLocators {
	
	@FindBy (xpath= " //span[contains(text(),'Account')]")
	 public WebElement Account;
	
	@FindBy (xpath= "//div[contains(text(),'Sign In')]")
	public WebElement SignIn;

	@FindBy (xpath= "//input[@id='email']")
	public WebElement username;
	
	@FindBy (xpath= "//input[@id='password']")
	public WebElement password;
	
	
	@FindBy (xpath= "//input[@automation-id=signin-submit-btn']")
	public WebElement Signinbutton;
}
