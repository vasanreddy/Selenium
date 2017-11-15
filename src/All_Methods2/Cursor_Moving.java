package All_Methods2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cursor_Moving {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tupaki.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.xpath("//a[@title='Tollywood Star Hero Facing Financial Trouble due to his Brother']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("scroll(0,3000)");
	      js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		Thread.sleep(4000);
		driver.close();
	}

}
