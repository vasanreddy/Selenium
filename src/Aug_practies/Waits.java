package Aug_practies;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://accounts.google.com/ServiceLogin");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("c://printer//screen.png"));
	
	driver.findElement(By.xpath("//input[contains(@id,'identifierId')]")).sendKeys("srinivaas.test");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("manohar123");
	
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']"))).click();
	
	//wait.until(ExpectedConditions.alertIsPresent(By.xpath("//span[text()='Next']"))).click();
	
	}

}
