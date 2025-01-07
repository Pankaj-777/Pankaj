package steps;

import org.openqa.selenium.By;

import actions.Common_Actions;
import actions.Ebay_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_Steps {
	Common_Actions common_actions;
	Ebay_Actions ebay_actions;
	
	public Ebay_Steps(Common_Actions common_actions, Ebay_Actions ebay_actions)
	{
		
		this.common_actions = common_actions;
		this.ebay_actions = ebay_actions;
	}

	@Given("I am on Ebay Home page")
	public void i_am_on_ebay_home_page() {
	   common_actions.goToUrl("https://www.ebay.com/");
	}

	@When("I am search for {string}")	
	public void i_am_search_for(String str1) throws Exception {
		ebay_actions.searchAnItem(str1);
		ebay_actions.clickSearchButton();
	    
	}

	@When("Click on first book in the list")
	public void click_on_first_book_in_the_list() {
	    
	}

	@When("Click on {string}")
	public void click_on(String string) {
	    	}

	@Then("Verify the cart has been updated and displays the number of items in the cart")
	public void verify_the_cart_has_been_updated_and_displays_the_number_of_items_in_the_cart() {

	}



}
