package All_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drog_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver ();
		driver.navigate().to("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String title=driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
	}

}
