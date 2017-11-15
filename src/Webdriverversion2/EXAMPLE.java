package Webdriverversion2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.tupaki.com/");
		
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	   driver.findElement(By.xpath("//a[@title='Amitabh Bachchan reveals why he didnt celebrate his 75th birthday']")).getAttribute("href");
	
	   	
	
	
	}
	


}
