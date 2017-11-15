package ScrollMethodWIthText;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrolldependsText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.emirates.com/in/english/book/flight-schedules/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("//dd[@class='smallBottomPadding']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		
	
		

	}

}
