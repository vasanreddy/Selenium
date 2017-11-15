package Aug_practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Cursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("http://www.tupaki.com/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//a[@title='MP Kavitha Challenges Jana Reddy']"));
		//ele.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("scroll(0,2500)");
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}

}
