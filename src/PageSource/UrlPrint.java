package PageSource;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UrlPrint {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin");
		String Title=driver.getTitle();
	    System.out.println("url print:"+driver.getTitle()); 
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println("Current URLis:"+CurrentUrl);
		//assertEquals(driver.getTitle(),driver.getCurrentUrl());
		//String pageSource=driver.getPageSource();
		//System.out.println("source view="+driver.getPageSource());
	      TakesScreenshot ts=(TakesScreenshot)driver;
	      File src=ts.getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(src,new File("c:\\print1\\screen.png"));
		//Thread.sleep(3000);
		//driver.quit();
	}

}
