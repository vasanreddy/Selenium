package practiesWebdriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver() ;
		driver.get("https://accounts.google.com");
		System.out.println("Title of webpage:"+driver.getTitle());    
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Srinivaas.test");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	   // driver.findElement(By.xpath("//input[@type='password' and@ class='whsOnd zHQkBf']")).sendKeys("manohar123");
	    WebDriverWait wait=new WebDriverWait(driver,15);
	    wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@type='password' and@ class='whsOnd zHQkBf']")))).sendKeys("manohar123");
	   Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@class='RveJvd snByac'  and text()='Next' ]")).click();
	}

}