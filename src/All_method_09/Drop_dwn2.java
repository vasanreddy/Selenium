package All_method_09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drop_dwn2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C://My Data//browsers//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.emirates.com/in/English/#");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(text(),'Book a flight')][1]")).click();
	WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'Adults:')][1]"));
	WebElement ele2=driver.findElement(By.xpath("//a[@aria-label='Select the number of adults over 12 years of age - 5  selected']"));
	
	Actions actions=new Actions(driver);
	actions.moveToElement(ele1).click().build().perform();
	Thread.sleep(4000);
	actions.moveToElement(ele2).click().build().perform();
	

	
	
	
	}

}
