package PrintScrenShot;

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



public class GmailScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("srinivaas.test");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("manohar123");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils .copyFile(src, new File("C:\\Sample\\Screen.png"));
		
		//FileUtils.copyFile(srcFile, destFile);
		//FileUtils.copyFile(src, new File("C:\\Sample\\Screen.png"));
		System.out.println("Screen shot is captured");
	   
		
		
		
	}

}
