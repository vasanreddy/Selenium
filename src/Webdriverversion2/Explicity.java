package Webdriverversion2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("srinivaas.test");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("manohar123");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manohar123");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}

}
