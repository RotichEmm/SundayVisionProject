package tt.ebay.stepDef;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomepageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchSteps {
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	@Given("^Open Ebay website$")
	public void open_Ebay_website() throws Throwable {
	     System.out.println("Open Ebay website");
		EbayHomepageActionsObj.loadEbayHomePage();
		
	}

	@When("^Search for mens shirts$")
	public void search_for_mens_shirts() throws Throwable {
		System.out.println("Search for mens shirts");
		EbayHomepageActionsObj.SearchShirt();	
	}

	@Then("^Item list should have only Shirts related products$")
	public void item_list_should_have_only_Shirts_related_products() throws Throwable {
	  System.out.println("Item list should have only shirts related products");
		EbaySearchResultActionsObj.verifyShirtRelatedProducts();    
	}
	
	}

	


