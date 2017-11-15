package All_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Date_picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver =new FirefoxDriver();
	driver.get("http://www.abhibus.com/operator/919/APSRTC");
    driver.findElement(By.xpath("//input[@name='journey_date']")).click();
    List<WebElement> ele=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
    System.out.println("total data:"+ele.size());
    
    for(int i=0;i<ele.size();i++){
    System.out.println(ele.get(i).getText());
    
        
    /*if(ele.get(i).equals("7")){
    ele.get(i).click();
    //break;
     * 
*/    }
    }
		
	}


