package Logics;

import javax.print.Doc;

import org.apache.poi.hslf.record.Document;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;

public class Sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://accounts.google.com");
	System.out.println(driver.getTitle());
	WebElement ele=driver.findElement(By.xpath("//input[@id='identifierId']"));
	

	JavascriptExecutor jse = (JavascriptExecutor) driver;
	//jse.executeScript("document.getElementById('email').value='vasanreddy31@gmail.com';");
	jse.executeScript("arguments[0].value='srinivaas.test';",ele);
	
	//WrapsDriver wrappedElement=(WrapsDriver)driver;
	//JavascriptExecutor js=(JavascriptExecutor)wrappedElement.getWrappedDriver();
	//.executeScript("arguments[0].value='srinivaas.test';",ele);
	
	//Runtime.getRuntime().exec(arg0)
	
	//Alert alert=driver.switchTo().alert();
	
	
	
	
	}

}
