package After_Home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scroll_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		
		WebElement text=driver.findElement(By.xpath("//span[text()='Text1']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("scroll(0,3000)");
		js.executeScript("arguments[0].scrollIntoView(true);",text);
		
		/*WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(locator))*/
		
		

	}

}
