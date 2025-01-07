package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class Common_Steps {
	
	private WebDriver driver;
	
	@Before(order = 0)
	public void setUp(){
		driver = new ChromeDriver();
		System.out.println("Global before hooks Executed");
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}

}
