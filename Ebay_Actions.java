package actions;

import org.openqa.selenium.WebDriver;

import elements.Ebay_Elements;
import steps.Common_Steps;

public class Ebay_Actions {

	private WebDriver driver;
	
	Ebay_Elements ebay_elements;
	
	public Ebay_Actions(Common_Steps common_steps){
		this.driver = common_steps.getDriver();
		ebay_elements = new Ebay_Elements(driver);
	}
	
	public void searchAnItem(String srchString){
		ebay_elements.searchBox.sendKeys(srchString);
	}
	
	public void clickSearchButton(){
		
	}
}
