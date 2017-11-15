package Date_Picker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus_DatePicure {

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
	    System.out.println("size is:"+ele.size());
	    
	    for(WebElement element: ele){
	    	
	    	System.out.println(element.getText());
	    	//System.out.println();
	    	
	    	if(element.getText().equals("29"))
	    	{
	    		element.click();
	    		break;
	    	}
	    	
	    }
	
	}

}
