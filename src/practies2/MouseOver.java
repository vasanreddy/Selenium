package practies2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args){
		
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.emirates.com/in/english/");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement ele=driver.findElement(By.xpath("//a[@class='toggle-menu-link' and text()='Book']"));
	WebElement ele1=driver.findElement(By.xpath("//a[@class='toggle-menu-link' and text()='Manage']"));
	WebElement ele2=driver.findElement(By.xpath("//a[@class='toggle-menu-link'  and text()='Experience']"));
	WebElement ele3=driver.findElement(By.xpath("//a[@href='/in/english/experience/chauffeur-drive/']"));
	
	Actions actions=new Actions(driver);
	actions.moveToElement(ele).build().perform();
	actions.moveToElement(ele1).build().perform();
	actions.moveToElement(ele2).build().perform();
	actions.moveToElement(ele3).click().build().perform();
	
	System.out.println("get the final page");
	driver.close();
	
	}
	
}
