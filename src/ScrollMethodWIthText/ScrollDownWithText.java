package ScrollMethodWIthText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDownWithText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.tupaki.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Click here to go to Tupaki.com")).click();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//a[@href='http://english.tupaki.com/nrisection/article/Mega-blood-drive-in-USA-by-APTA/54792']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
	}

}
