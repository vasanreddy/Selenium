package practies2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.internal.compiler.ast.Argument;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPrint {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

	
               System.setProperty("webdriver.chrome.driver", "C://My Data//browsers//chromedriver.exe");
               WebDriver driver=new ChromeDriver();
               //driver.manage().window().maximize();
               driver.get("https://accounts.google.com/ServiceLogin");
	           System.out.println(driver.getTitle());
	          // driver.manage().deleteAllCookies();
	           driver.findElement(By.xpath("//input[@type='email'and @class='whsOnd zHQkBf']")).sendKeys("srinivaas.test");
	           driver.findElement(By.xpath("//span[text()='Next']")).click();
	           Thread.sleep(4000);
	           driver.findElement(By.xpath("//input[@name='password']")).sendKeys("manohar123");
	           WebDriverWait wait=new WebDriverWait(driver,10);
	           wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Next']")))).click();
	           TakesScreenshot ts=(TakesScreenshot)driver;
	           File src=ts.getScreenshotAs(OutputType.FILE);
	           FileUtils.copyFile(src,new File("c:\\print.screen.png"));
	           
	           Thread.sleep(4000);
	           JavascriptExecutor js=(JavascriptExecutor)driver;
	          // js.executeScript("Scroll(0,3000)");
	           js.executeScript("Argument[0]scrollintoview(false);",src);
	           
          
	
	}

}
