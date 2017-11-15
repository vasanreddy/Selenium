package Webdriverversion2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox_Enable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/config/login");
		String titke=driver.getTitle();
		System.out.println(driver.getTitle());
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("yui_3_18_1_11_1498146850770_119"))).isDisplayed();
         //driver.findElement(By.xpath("//label[@for='persistent']"));
		WebElement ele=driver.findElement(By.xpath("//label[@for='persistent']"));
		ele.click();
	}

}
