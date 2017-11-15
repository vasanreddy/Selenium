package All_method_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.emirates.com/in/english/");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement ele1=driver.findElement(By.xpath("//a[@class='toggle-menu-link' and  text()='Book']"));
	System.out.println(driver.getTitle());
	WebElement ele2=driver.findElement(By.xpath("//a[@class='toggle-menu-link' and text()='Manage' ]"));
	System.out.println(driver.getTitle());
	WebElement ele3=driver.findElement(By.xpath("//a[@class='toggle-menu-link' and text()='Experience']"));
	System.out.println(driver.getTitle());
	WebElement ele4=driver.findElement(By.xpath("//a[@class='toggle-menu-link' and text()='Where we fly']"));
	System.out.println(driver.getTitle());
	WebElement ele5=driver.findElement(By.xpath("//a[@href='/in/English/destinations/flights-to-asia-pacific.aspx']"));
	System.out.println(driver.getTitle());
	WebElement ele6=driver.findElement(By.xpath("//input[@id='seldcity1-suggest']"));

	Actions move=new Actions(driver);
	Thread.sleep(3000);
	move.moveToElement(ele1).build().perform();
	Thread.sleep(3000);
	move.moveToElement(ele2).build().perform();
	Thread.sleep(3000);
	move.moveToElement(ele3).build().perform();
	Thread.sleep(3000);
    move.moveToElement(ele4).build().perform();
    Thread.sleep(3000);
    move.moveToElement(ele5).click().build().perform();
    Thread.sleep(3000);
   System.out.println( move.contextClick());
    
	}
}
