package Logics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyPast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='email']"));
		ele.sendKeys("bar");
		
		ele.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	    ele.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	    //ele.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	    
	    WebElement ele1=driver.findElement(By.xpath("//input[@id='pass']"));
	    ele1.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	    
		
		
		
	}

}
