package AgainAttendClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.emirates.com/in/english/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele1=driver.findElement(By.xpath("//a[@class='toggle-menu-link' and text()='Book']"));
		WebElement ele2=driver.findElement(By.xpath("//a[@class='toggle-menu-link' and text()='Manage']"));
		WebElement ele3=driver.findElement(By.xpath("//a[@class='toggle-menu-link' and text()='Experience']"));
		WebElement ele4=driver.findElement(By.xpath("//a[text()='First Class']"));
		
		
		Actions action=new Actions(driver);
		action.moveToElement(ele1).build().perform();
		action.moveToElement(ele2).build().perform();
		action.moveToElement(ele3).build().perform();
		action.moveToElement(ele4).build().perform();

	}

}
