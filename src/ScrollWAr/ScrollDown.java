package ScrollWAr;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com");
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
        je.executeScript("scroll(0,1500)");
		
        Thread.sleep(2000);
		je.executeScript("scroll(0,-800)");
	}

}
