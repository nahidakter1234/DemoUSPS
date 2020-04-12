package walmart.PageElements;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UspsAddChangeLocators {

	
	@FindBy (xpath="//input[@id='home-input']")
	public WebElement  SearchBtn;
	
	@FindBy(xpath="//button[@class='input--search btn']")
	public WebElement Search;
	
	//@FindBy (xpath="//span[@class='reskin-mover-type__title'][contains(text(),'Individual')]")
	//public WebElement Individual;
}
