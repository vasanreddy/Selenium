package ScrollWAr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.tupaki.com/advertisement");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.linkText("Click here to go to Tupaki.com")).click();
	JavascriptExecutor je=(JavascriptExecutor)driver;
	
	je.executeScript("scroll(0,2000)");
	
	Thread.sleep(5000);
	
	je.executeScript("scroll(0,2000)");

	
		
	}

}
