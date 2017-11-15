package All_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Move {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.tirumala.org/advancebooking.aspx");
		WebElement attri=driver.findElement(By.xpath("//a[text()='Temples']"));
		Thread.sleep(4000);
	    WebElement ele=driver.findElement(By.xpath("//a[text()='Piligrim Services ']"));
		Thread.sleep(4000);

	    WebElement ele1=driver.findElement(By.xpath("//a[text()='Online Services']"));
	
         Actions move=new Actions(driver);
         move.moveToElement(attri).perform();
         move.moveToElement(ele).build().perform();
         move.moveToElement(ele1).build().perform();
	
	}

}
