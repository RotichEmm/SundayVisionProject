package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayFilterLocators {
	
	@FindBy(xpath="//span[contains(text(),'shirts for men']")
	public WebElement EbayFilter;

}
