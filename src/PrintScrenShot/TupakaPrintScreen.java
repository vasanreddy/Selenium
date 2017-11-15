package PrintScrenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.http.entity.mime.content.FileBody;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TupakaPrintScreen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.tupaki.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Click here to go to Tupaki.com")).click();
	    
	    TakesScreenshot shot=(TakesScreenshot)driver;
	    File src=shot.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("c:\\print\\scree.png"));
		
		
	}

}
