package RadioCheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Erotics_Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.emirates.com/in/english/");
	System.out.println(driver.getTitle());
	
	driver.findElement(By.xpath("//a[@class='toggle-menu-link' and text()='Book']")).click();
	driver.findElement(By.xpath("//a[@href='/in/english/book/flight-schedules/']")).click();
	//WebElement ele=driver.findElement(By.xpath("//input[@id='MainContent_CtlFlightSchedule1_rbOneWay']"));
	//ele.click();
	List<WebElement> ele=driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println("total elements:"+ele.size());
	
	for(int i=0;i<ele.size();i++){
		System.out.println(ele.get(i).getAttribute("value"));
		
		if(ele.get(i).getAttribute("value").equalsIgnoreCase("rbWeeklySchedule")){
			System.out.println(ele.get(i).isSelected());
			ele.get(i).click();
			System.out.println(ele.get(i).isSelected());
			break;
		}
	
	
	
	}
	
	
	
	
	}




}
