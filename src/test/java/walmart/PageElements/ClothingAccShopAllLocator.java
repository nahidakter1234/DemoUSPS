package walmart.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClothingAccShopAllLocator {

	@FindBy (xpath= "//button[@class='f_a al_c f_c']//img")
	public WebElement Spark;


	@FindBy (xpath= "//div[@id='header-spark-menu']//button[4]")
	public WebElement ClothingShoes;
	
	@FindBy (xpath="//a[contains(text(),'Shop All Fashion')]")
	public WebElement ShopAll;

}
