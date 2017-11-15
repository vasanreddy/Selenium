package All_method_09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		System.out.println(driver.getTitle());
		WebElement ele=driver.findElement(By.className("bcd"));
		System.out.println(ele.getText());
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	  //  js.executeScript("scroll(0,3500)");
	    js.executeScript("arguments[0].scrollIntoView(true);",ele);
	
	}

}
