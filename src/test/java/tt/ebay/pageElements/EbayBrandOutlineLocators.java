package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayBrandOutlineLocators {
	//Brand Nike
			@FindBy(xpath="//*[@aria-label='Nike']")
			public WebElement cbxBrandNike;
					
			//Brand Adidas
			@FindBy(xpath="//*[@aria-label='adidas']")
			public WebElement cbxBrandAdidas;
			
			//Unbranded
			@FindBy(xpath="//*[@aria-label='Unbranded']")
			public WebElement cbxUnbranded;
			
			//Validate Nike
			@FindBy(xpath="//*[contains(text(),'Nike')]")
			public WebElement txtNike;
			
			//Validate Adidas
			@FindBy(xpath="//*[contains(text(),'Adidas')]")
			public WebElement txtAdidas;
			
			//Validate Unbranded
			@FindBy(xpath="//*[contains(text(),'Unbranded')]")
			public WebElement txtUnbranded;
	}

