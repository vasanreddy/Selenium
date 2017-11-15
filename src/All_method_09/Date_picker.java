package All_method_09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Date_picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://apsrtconline.in/oprs-web/guest/link/home.do?h=1");
	driver.manage().deleteAllCookies();
	driver.getCurrentUrl();
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("txtJourneyDate")).click();
	List<WebElement>list=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
	System.out.println(list.size());
	
	
	for(WebElement ele:list){
		
		System.out.println(ele.getText());
		
		if(ele.getText().equals("12")){
			
			ele.click();
			
			break;
		}
	}
	
/*	
	for(int i=0;i<list.size();i++){
		
		System.out.println(list.get(i).getText());
		
		if(list.get(i).getText().equals("13")){
		
		list.get(i).click();
		
		break;
	}
	
}*/
	
}

}
