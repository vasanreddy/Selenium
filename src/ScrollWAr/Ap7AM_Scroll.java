package ScrollWAr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ap7AM_Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver =new FirefoxDriver();
     
     driver.get("https://www.cleartrip.com/");
     driver.manage().window().maximize();
     System.out.println(driver.getTitle());
    WebElement ele= driver.findElement(By.xpath("//h4[text()=' Snow City ']"));
     JavascriptExecutor js=( JavascriptExecutor)driver;
    // js.executeScript("scroll(0,400)");
     js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}

}
