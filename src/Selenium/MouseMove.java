package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.emirates.com/in/english/");
		System.out.println("open the window");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement BOOK=driver.findElement(By.xpath("//a[@ class='toggle-menu-link' and text()='Book']"));
		Thread.sleep(5000);
		WebElement BookFlights=driver.findElement(By.xpath("//a[@href='/SessionHandler.aspx?pageurl=/IBE.aspx&pub=/in/English&section=IBE&j=f' and text()='Book flights']"));
		//WebElement MANAGE=driver.findElement(By.xpath("//a[@class='toggle-menu-link' and @aria-expanded='false' and text()='Book']"));
		//WebElement ManageBooking=driver.findElement(By.xpath("//a[@class='t095-cta' and text()='Manage booking']"));
		
		Actions mouse=new Actions(driver);
       mouse.moveToElement(BOOK).build().perform();
       mouse.moveToElement(BookFlights).click().build().perform();
       // mouse.moveToElement(MANAGE).build().perform();
        //mouse.moveToElement(ManageBooking).click().build().perform();

	}

}
