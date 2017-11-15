package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Abibus_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.abhibus.com/operator/919/APSRTC");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath("html/body/header/div/div[3]/div/ul/li"));
		Actions act =new Actions(driver);
		act.moveToElement(element).click().perform();
		
		
	
		
		
	}

}
