package Webdriverversion2;

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
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("http://jqueryui.com");
	 driver.findElement(By.linkText("Draggable")).click();
	 driver.findElement(By.linkText("Droppable")).click();
	 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']")));
	 
	 WebElement source= driver.findElement(By.id("draggable"));
	 WebElement target= driver.findElement(By.id("droppable"));
	 
	 Actions action =new Actions(driver);
	 action.dragAndDrop(source, target).perform();  //http://toolsqa.com/selenium-webdriver/drag-drop/
	 //action.contextClick(onElement) //Using for right click option 
	 //action.doubleClick()//double clic an attributes
	 
	 driver.switchTo().defaultContent();
	}

} /*Build.perform controle the test exicution 
   ex:drog and drop ().build.perform 1st exicution 
       if any action ...each and every one Build .perform is given good one */
