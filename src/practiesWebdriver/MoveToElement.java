package practiesWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.monsterindia.com/");
		driver.manage().window().maximize();
		System.out.println("title ofweb Page:"+driver.getTitle());
		WebElement ele=driver.findElement(By.xpath("//a[@href='http://jobsearch.monsterindia.com/search.html' and @class='hidden-xs hidden-sm']"));
		WebElement ele2=driver.findElement(By.linkText("My Monster"));
		WebElement ele3=driver.findElement(By.xpath("//a[@href='http://content.monsterindia.com/index.html']"));
		WebElement ele4=driver.findElement(By.linkText("Career Center"));
		Actions mouse =new Actions (driver);
		Thread.sleep(5000);
		mouse.moveToElement(ele).build().perform();
		Thread.sleep(5000);
		mouse.moveToElement(ele2).build().perform();
		Thread.sleep(5000);
		mouse.moveToElement(ele3).build().perform();
		Thread.sleep(5000);
		mouse.moveToElement(ele4).click().build().perform();
		System.out.println("open the final page:");
	}

}
