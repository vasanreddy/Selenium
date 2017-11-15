package All_method_09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datepickur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.abhibus.com/operator/919/APSRTC");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
	List<WebElement> ele=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
	//String press=Keys.chord(Keys.SHIFT,Keys.ENTER);
	
	
	System.out.println("list of value :"+ele.size());

	
	for(WebElement element:ele){
		System.out.println(element.getText());
		
	if(element.getText().equalsIgnoreCase("25")){
		element.click();
		break;
	}
	}
	
	
	
	
	/*	for(int i=0;i<ele.size();i++){
		
		System.out.println(ele.get(i).getText());
		if(ele.get(i).getText().equalsIgnoreCase("20")){
			
			ele.get(i).click();
			break;
		}
		

	}*/
	
	driver.close();
	
	
	}

}
