package All_Methods2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DrogAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
	    WebElement source=driver.findElement(By.cssSelector("div[id=draggable]"));
	    WebElement target=driver.findElement(By.cssSelector("div[id='droppable']"));
		
	
		Actions action=new Actions (driver);
		action.dragAndDrop(source, target).build().perform();
	
		
		driver.switchTo().defaultContent();
		//break;
		
		
		
	}

}
