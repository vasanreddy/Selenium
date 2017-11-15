package General_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin");
		System.out.println(driver.getTitle());
		WebElement ele=driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @id='identifierId']"));
	    System.out.println(ele.getLocation());
	    System.out.println(ele.getTagName());
		System.out.println(ele.getSize());
		
	    
	}

}
