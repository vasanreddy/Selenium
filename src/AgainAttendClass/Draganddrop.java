package AgainAttendClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String []args){
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://jqueryui.com/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		
		WebElement ele=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement ele1=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action =new Actions(driver);
		action.dragAndDrop(ele, ele1).build().perform();
		
		driver.switchTo().defaultContent();
	
		
		
		
		
	}

}
