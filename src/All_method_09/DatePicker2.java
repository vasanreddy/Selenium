package All_method_09;

import mx4j.log.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.abhibus.com/operator/919/APSRTC");
	
	driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		//Log.info("Clicking on From daterange dropdown");
		JavascriptExecutor executor8 = (JavascriptExecutor)driver;
		executor8.executeScript("document.getElementByname('journey_date').style.display='block';");
		Select select8 = new Select(driver.findElement(By.name("journey_date")));
		select8.selectByVisibleText("22 Aug 2017");
		Thread.sleep(3000);

		//Log.info("Clicking on To daterange dropdown");
		JavascriptExecutor executor10 = (JavascriptExecutor)driver;
		executor10.executeScript("document.getElementByname('journey_rdate').style.display='block';");
		Select select10 = new Select(driver.findElement(By.name("journey_rdate")));
		select10.selectByVisibleText("24 Aug 2017");
		Thread.sleep(3000);
	
	
	
	
	
	
	
	}

}
