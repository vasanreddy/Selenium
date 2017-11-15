package RadioCheckBox;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cleartrip_Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		String titke=driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		List<WebElement> ele=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("list of element:"+ele.size());
		
		for(int i=0;i<ele.size();i++){
			
			System.out.println("lis of elements:"+ele.get(i).getAttribute("value"));
			
			Thread.sleep(3000);
			if(ele.get(i).getAttribute("value").equalsIgnoreCase("Round trip")){
				
				System.out.println(ele.get(i).isSelected());
				
				ele.get(i).click();
				break;
			}
		}
		
		
	}

}
