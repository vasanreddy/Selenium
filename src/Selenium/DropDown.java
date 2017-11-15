package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		   WebDriver driver=new FirefoxDriver();
		   driver.get("https://www.emirates.com/in/english/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//a[@ class='toggle-menu-link' and text()='Book']")).click();
			driver.findElement(By.xpath("//a[@href='/SessionHandler.aspx?pageurl=/IBE.aspx&pub=/in/English&section=IBE&j=f' and text()='Book flights']")).click();
			Thread.sleep(5000);
			WebElement adult=driver.findElement(By.xpath("//a[@class='chosen-single chosen-default' and text()='Adults: ']"));
		   
		    Select sel=new Select(adult);
		     sel.selectByValue("5");
		  
		  
		   
	}

}
