package After_Home;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.abhibus.com/operator/919/APSRTC");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@name='journey_date']")).click();
	List<WebElement> ele=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
     System.out.println(ele.size());
     
     for(int i=0;i<ele.size();i++){
    	 System.out.println(ele.get(i).getText());
    
    	if(ele.get(i).getText().equals("30")){
    	ele.get(i).click();
    	break;
    }
    
     }

	}

}
