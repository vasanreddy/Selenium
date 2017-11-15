package All_method_09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Box {

	//http://learn-automation.com/selenium-interview-questions-and-answers/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://toolsqa.com/automation-practice-form/");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	List<WebElement>list=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i).getAttribute("value"));
		if(list.get(i).getAttribute("value").equals("Selenium IDE")){
		
		System.out.println(list.get(i).isSelected());
		list.get(i).click();
		}
	}
	
	}

}
