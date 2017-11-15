package practies2;

import java.util.List;

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
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//input[@name='journey_date']")).click();
	List<WebElement>total =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
	System.out.println(total.size());
	
	/*for(int i=0;i<total.size();i++){
		System.out.println(total.get(i));
		
		if(total.get(i).equals("21")){
			
			total.get(i).click();
			
			break;
			
		}
	}*/
	
	for(WebElement element:total){
		
		System.out.println(element.getText());
		
		if(element.getText().equals("26")){
		
		element.click();
		break;
	}
	}

	}
}
