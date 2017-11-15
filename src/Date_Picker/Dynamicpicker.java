package Date_Picker;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamicpicker {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.abhibus.com/operator/919/APSRTC");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("journey_date")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
		System.out.println("Size is:"+ele.size());
		
		for(WebElement element: ele)//for each loop
		{
			System.out.println(element.getText());
			//System.out.println(ca.getTime());
		    
			if(element.getText().equals("30"))
			{
				element.click();
				break;
			}
		
		}
		
		

	}

}
