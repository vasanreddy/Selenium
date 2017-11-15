package practiesWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogAndDropEX {

	public static void main( String[]  args){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.webydo.com/pricing.html");
		System.out.println("get the page:"+driver.getTitle());
		WebElement ele1=driver.findElement(By.xpath("//span[@style='color:#76caff;']"));
		WebElement ele=driver.findElement(By.xpath("//p[@class='pricing-new-toggle-black ospfxwa1ffe803764393047d6e35c8a038e5a9ossfx']"));
		
		Actions action =new Actions(driver);
		action.dragAndDrop(ele1, ele).perform();
		
		driver.switchTo().defaultContent();
	
}

}
