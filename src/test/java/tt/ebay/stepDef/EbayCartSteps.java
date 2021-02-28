package tt.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayCartActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayCartSteps {
	
	EbayCartActions EbayCartActionsObj = new EbayCartActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	//@Given("^Open Ebay Website$")
	//public void open_Ebay_Website() throws Throwable {
	//	EbayCartActionsObj.loadEbayHomePage();
	
	

	//@When("^Search for shirts$")
	//public void search_for_shirts() throws Throwable {
	//EbayCartActionsObj.SelectItem();
	
	
	
	//@When("^Select first shirt product on item list$")
	//public void select_first_shirt_product_on_item_list() throws Throwable {
	   // EbaySearchResultActionsObj.selectItem();
		   
	

	@When("^Select color on shirt$")
	public void select_color_on_shirt() throws Throwable {
		EbayCartActionsObj.selectColor();
	}

	@When("^Select size on shirt$")
	public void select_size_on_shirt() throws Throwable {
		EbayCartActionsObj.selectSize();	 
	}
	@When("^Select quantity of shirt$")
	public void select_quantity_of_shirt() throws Throwable {
	EbayCartActionsObj.selectQuantity();
	}
	@When("^Add to Cart$")
	public void add_to_Cart() throws Throwable {
		EbayCartActionsObj.addToCart();
		  
	}

}
	


	    
	   
	
	
