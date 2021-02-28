package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepageLocators {
//Seacrh for anything
		@FindBy(xpath="//input[@id='gh-ac']")
		public WebElement txtbxSearchForAnything;
		
		//Search 
		@FindBy(xpath="//input[@id='gh-btn']")
		public WebElement btnSearch;
		
		//Search - Locators without page factory
		//WebElement btnSearch2 = SetupDrivers.driver.findElement(By.xpath("//input[@id='gh-btn']"));
}

