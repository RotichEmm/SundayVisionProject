package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	
	// Sleeve Lenght
	@FindBy(xpath="//h3[text()='Sleeve Length']")
	public WebElement txtSleeveLength;
	
	// Long Sleeve 
	@FindBy(xpath="//input[@aria-label='Long Sleeve']")
	public WebElement cbxLongSleeve;
	
	//validate Long Sleeve
	@FindBy(xpath="//*[contains[text(),'Long Sleeve']")
	public WebElement txtLongSleeve;
	
	//Brand Nike
	@FindBy(xpath="//*[aria-label='Nike')]")
	public WebElement cbxBrandNike;
	
	//Brand Adidas
	@FindBy(xpath="//*[aria-label='Adidas')]")
	public WebElement cbxBrandAdidas;
	
	//Unbranded
	@FindBy(xpath="//*[aria-label='Unbranded')]")
	public WebElement cbxUnbranded;
	
	//validate Adidas
	@FindBy(xpath="//*[contains[text(),'Adidas']")
	public WebElement txtAdidas;
	
	//validate Nike
	@FindBy(xpath="//*[contains[text(),'Nike']")
	public WebElement txtNike;
		
	//validate Unbranded
	@FindBy(xpath="//*[contains[text(),'Unbranded']")
	public WebElement txtUnbranded;

	public void selectlnkItem() {
	
		
	}

	
	
	
		
		
	

}
