package Webdriverversion2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Input_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		String TypedText=driver.findElement(By.name("firstname")).getAttribute("asfasfd");
	}

}
