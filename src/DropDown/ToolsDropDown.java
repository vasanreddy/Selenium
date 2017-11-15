package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement element=driver.findElement(By.xpath("//select[@id='continents']"));
		
		Select select=new Select(element);
		select.selectByValue("Asia");
		List<WebElement>country=select.getOptions();
		System.out.println("number of countrys:"+country.size());
		
		for(int i=0;i<country.size();i++){
			System.out.println(country.get(i).getText());
			
		}
		
		
	}

}


////select[@id='continents']