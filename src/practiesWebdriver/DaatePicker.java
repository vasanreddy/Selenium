package practiesWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DaatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		WebDriverWait wait=new WebDriverWait (driver,15);
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//label[@class='db text-trans-uc']")))).click();
		//driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
	    List<WebElement> ele=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr/td"));
	    System.out.println("total number:"+ele.size());
	    
	    for(int i=0;i<ele.size();i++){
	    	System.out.println("total data:"+ele.size());
	    	System.out.println(ele.get(i).getText());
	    	
	    	if(ele.get(i).getText().equals("30"))
	    	{
	    		ele.get(i).click();
	    		break;
	    	}
	    }
	    
	    

	}

}
