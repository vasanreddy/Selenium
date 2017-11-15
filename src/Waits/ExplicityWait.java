package Waits;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//input[@class='inputtext' and  @id='email']")).sendKeys("srinivasulunagam@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Umadevi98");
	    //driver.findElement(By.cssSelector("#u_0_t")).click();
	    WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Log In']"))).click();
		
		//wait.until(ExpectedConditions.(By.xpath("//input[@value='Log In']"))).click();
	    //Thread.sleep(5000);
	    //driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("c:\\print\\screen.png"));
		
		
		
		
	}

}
