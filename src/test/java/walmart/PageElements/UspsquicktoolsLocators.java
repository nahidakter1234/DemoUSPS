package walmart.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UspsquicktoolsLocators {

	
	@FindBy (xpath="//a[@class='nav-first-element menuitem active']")
	public WebElement QuickTools  ;
	
	
	@FindBy (xpath="//li[7]//a[1]//img[1]")
	public WebElement LookupZipcode  ;
}
