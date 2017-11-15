package Webdriverversion2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/signin");
		String title=driver.getTitle();
		System.out.println("page should be display");
		driver.findElement(By.xpath("//input[contains(@type,'password')]html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/div[1]/div/div[1]/div/div[1]/input")).getSize().getHeight();
		
	}

}
