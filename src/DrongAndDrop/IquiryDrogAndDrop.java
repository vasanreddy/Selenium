package DrongAndDrop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IquiryDrogAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']")));
        
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, target).perform();
		//actions.moveByOffset(xOffset, yOffset)
		
		driver.switchTo().defaultContent();
		
   
	}

}
