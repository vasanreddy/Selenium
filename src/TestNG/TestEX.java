package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestEX {
	
	@Test
	
	public void  SampleTest()
	{
		WebDriver driver =new FirefoxDriver();
		
		System.out.println("Test Method");
		//driver.get("http://www.google.co.in");
		//driver.getTitle();
		
	}
	

}
