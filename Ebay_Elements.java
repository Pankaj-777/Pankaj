package elements;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Elements {

	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='gh-ac']") public WebElement searchBox;
	@FindBy(xpath = "//input[@id='gh-btn']") public WebElement searchButton;
	
	public Ebay_Elements(WebDriver driver)
	{
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
