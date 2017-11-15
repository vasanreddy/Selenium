package All_method_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drog_drop {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

                 driver=new FirefoxDriver();
                 driver.manage().window().maximize();
                 driver.get("http://jqueryui.com/");
                 System.out.println(driver.getTitle());
                 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                 driver.findElement(By.xpath("//a[text()='Draggable']")).click();
                 driver.findElement(By.xpath("//a[text()='Droppable']")).click();
                 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
                 
                 WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
                 WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
                
                 
                 Actions actions=new Actions(driver) ;
                 actions.dragAndDrop(source,target).perform();
                 
                driver.switchTo().defaultContent();
	}

     

}
