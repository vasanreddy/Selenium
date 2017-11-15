package All_methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicity_wait {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//input[@class='inputtext'and @name='email']")).sendKeys("srinivasulunagam@gmail.com");
	driver.findElement(By.xpath("//input[@type='password' and @class='inputtext']")).sendKeys("Umadevi98");
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Log In']"))).click();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("c://print1//srcreen.png"));
   
	
	driver.close();
	}

}
