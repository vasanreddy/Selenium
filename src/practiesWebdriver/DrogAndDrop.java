package practiesWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DrogAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //System.setProperty("webdriver.chrome.driver","C://My Data//Selenium//browsers//chromedriver.exe");
      // WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
       driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
       driver.get("http://jqueryui.com");
       driver.manage().window().maximize();
       driver.findElement(By.linkText("Draggable")).click();
       driver.findElement(By.linkText("Droppable")).click();
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']")));
       
       WebElement Source=driver.findElement(By.id("draggable"));
       WebElement Target=driver.findElement(By.id("droppable"));
       
       Actions act=new Actions(driver);
       act.dragAndDrop(Source,Target).perform();
      
       driver.switchTo().defaultContent();
       
       
       
       
     
       
       
       
	}

}
