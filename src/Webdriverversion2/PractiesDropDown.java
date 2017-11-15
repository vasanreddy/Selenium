package Webdriverversion2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiesDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://My Data//browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.abhibus.com/abhioffer?gclid=CL7NmK_vuNQCFY0XaAod6MsDEQ");
		//driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("open online bus booking");
		
		WebElement ele=driver.findElement(By.xpath("//input[@name='source']"));
		Select select=new Select(ele);
		select.selectByValue("Kadapa");
		List<WebElement> city=select.getOptions();
		System.out.println("total city numbere:"+city.size());
		
		
		driver.findElement(By.name("journey_date")).click();
		Select ct=new Select(driver.findElement(By.name("journey_date")));
		ct.deselectAll();
		ct.selectByValue("14");
		List<WebElement> Date=ct.getOptions();
		System.out.println("data of jurney:"+Date.size());
		
	
		
		
		
		
		
	}

}
