package Alets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Miamioh_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.users.miamioh.edu/reajt/practice3/basics/popupBoxes.html");
		
		
		//driver.manage().window().maximize();
		/*Options options=driver.manage();
		Window window=options.window();
		window.maximize();*/
		///
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='button' and @value='Show confirm box']")).click();
	}

}
