package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;

public class EbayHomePageSteps {
	EbayHomePageActions EbayHomePageActionsobj = new EbayHomePageActions();

	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
	}
	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomePageActionsobj.searchShoes(); 
	}
	@When("^Search for Pants$")
	public void search_for_Pants() throws Throwable {
		EbayHomePageActionsobj.searchPants();
	}
	@When("^Search for Shirts$")
	public void search_for_Shirts() throws Throwable {
		EbayHomePageActionsobj.searchShirts();
	}
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomePageActionsobj.SearchItems(items);
	}
	@Given("^Search for Big & Tall Cotton Tee$")
	public void search_for_Big_Tall_Cotton_Tee() throws Throwable {
		EbayHomePageActionsobj.SearchBigTshirt();
	}
	
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
	   
	}
	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		
		}
}
