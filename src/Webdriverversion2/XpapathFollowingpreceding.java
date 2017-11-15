package Webdriverversion2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpapathFollowingpreceding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		//Thread.sleep(5000);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2017/gen-120X45-452017.gif']")).click();
		/*String Parent_Window=driver.getWindowHandle();
		{
	    for (String child_Window:driver.getWindowHandles());
		}
		driver.switchTo().window("child_Window");*/
		//Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[contains(text(),'Home')]//following::a")).click();
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//area[@href='https://www.facebook.com/ProudToBeGenpact']"))).click();
		
		

	}

}
