package walmart.PageActions;


import walmart.PageElements.ClothingAccShopAllLocator;
import walmart.Utilities.SetupDriver;

public class ClothingAccShopAllActions {
	
	ClothingAccShopAllLocator ClothingAccShopAllLocatorobj = new ClothingAccShopAllLocator();
	
	public void launchwalmartpage(){
	SetupDriver.driver.get("https://www.walmart.com/");
	SetupDriver.driver.manage().window().maximize();

	}
	public void sparkmenu(){
		ClothingAccShopAllLocatorobj.Spark.click();
	}
	public void clothingshoes(){
		ClothingAccShopAllLocatorobj.ClothingShoes.click();
		ClothingAccShopAllLocatorobj.ShopAll.click();
		
	}
	
	
	}

