package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		//WebElement all=driver.findElement(By.cssSelector("#searchDropdownBox"));
		WebElement allValues=driver.findElement(By.cssSelector("#searchDropdownBox"));
		Select sel=new Select(allValues);
		sel.selectByVisibleText("Baby");
		
		List<WebElement> listOfWebElements=sel.getOptions();
		System.out.println("total data:"+listOfWebElements.size());
		
		for(int i=1;i<listOfWebElements.size();i++)		
		{
			
		System.out.println(listOfWebElements.get(i));
		
		}

	}

}
