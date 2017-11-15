package Date_Picker;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Apsrtc_DatePickur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new FirefoxDriver();
		driver.get("https://apsrtconline.in/oprs-web/guest/home.do?h=1");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
		
		System.out.println("list of table:"+ele.size());
		
		for(int i=0;i<ele.size();i++){
			
			//System.out.println("total value:"+ele.size());
			System.out.println(ele.get(i).getText());
		 
		     if(ele.get(i).getText().equalsIgnoreCase("20"))
		     {
		    	 ele.get(i).click();
		    	 break;
		    	 
		    	 
		     }
		
		/*for(WebElement element:ele){
			
			System.out.println(element.getText());
			
			if(element.getText().equals("26")){
			
			element.click();
			break;
		}
		
	}*/

   }
}
}