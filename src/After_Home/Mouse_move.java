	package After_Home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_move {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.emirates.com/in/english/");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement book=driver.findElement(By.xpath("//a[contains(text(),'Book')][1]"));
	WebElement manage=driver.findElement(By.xpath("//a[@class='toggle-menu-link' and text()='Manage']"));
	WebElement expe=driver.findElement(By.xpath("//a[@class='toggle-menu-link' and text()='Experience']"));
	WebElement loyality=driver.findElement(By.xpath("//li[@id='gnav-loyalty']"));
	WebElement ele=driver.findElement(By.xpath("//a[@class='manage-booking-cta'  and @data-link= 'Book:Search flights']"));
	
	Actions action=new Actions(driver);
	Thread.sleep(4000);
	action.moveToElement(book).build().perform();
	Thread.sleep(3000);
	action.moveToElement(manage).build().perform();
	Thread.sleep(3000);
    action.moveToElement(expe).build().perform();
    Thread.sleep(4000);
    action.moveToElement(loyality).build().perform();
    Thread.sleep(4000);
    action.moveToElement(ele).click().build().perform();
	
	}

}
