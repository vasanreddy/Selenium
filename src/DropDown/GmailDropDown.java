package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver()	;
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[text()='More options']")).click();
	//driver.findElement(By.xpath("//div[@class='side-content']")).click();
	
	driver.findElement(By.name("btnI")).click();
	WebElement element=driver.findElement(By.id("lang-chooser"));
	
	Select select=new Select(element);
	Thread.sleep(5000);
	select.selectByVisibleText("‪magyar‬");
	List<WebElement> ele=select.getOptions();
	
	System.out.println("total languages:"+ele.size());
	
	for(int i=1;i<ele.size();i++){
		System.out.println(ele.get(i).getText());
		
	    }
		
    }
	
}


