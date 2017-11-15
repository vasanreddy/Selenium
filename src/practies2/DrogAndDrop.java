package practies2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("http://jqueryui.com/");
	   String title=driver.getTitle();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.findElement(By.xpath("//a[text()='Draggable']")).click();
       driver.findElement(By.xpath("//a[text()='Droppable']")).click();
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
       
       
       WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
       WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
       
       
       Actions actions=new Actions (driver);
       actions.dragAndDrop(source, target).build().perform();
      
        
       driver.switchTo().defaultContent();
	}
   
}
