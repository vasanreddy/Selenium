package ScrollWAr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Echo_scrollDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/it/htmlforms09.htm");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement ele=driver.findElement(By.xpath("//font[text()='N ESEMPIO:']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("scroll(0,1000)");
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
	}

}
