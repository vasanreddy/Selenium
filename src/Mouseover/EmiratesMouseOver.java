package Mouseover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class EmiratesMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.emirates.com/in/english/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement ele= driver.findElement(By.xpath("//a[@class='toggle-menu-link' and @data-link='Experience']"));
        Thread.sleep(5000);
        WebElement ele1=driver.findElement(By.xpath("//a[text()='Chauffeur-drive']"));
        
        
        Actions mouse=new Actions(driver);
		mouse.moveToElement(ele).doubleClick().build().perform();
		
		mouse.moveToElement(ele1).click().build().perform();
		mouse.doubleClick().click().build().perform();
		//mouse
	
	}

}
