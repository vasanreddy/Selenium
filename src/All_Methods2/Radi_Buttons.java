package All_Methods2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radi_Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://toolsqa.com/automation-practice-form/");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	List<WebElement> ele=driver.findElements(By.xpath("//input [@name='exp']"));
	System.out.println(ele.size());
	for(int i=0;i<ele.size();i++){
		//System.out.println("list of elements"+ele.get(i).getText());
		
		System.out.println(ele.get(i).getAttribute("value"));
		
		if(ele.get(i).getAttribute("value").equalsIgnoreCase("5")){
	    
			ele.get(i).click();
		break;
		}
	}
	//driver.close();
	
	
	}

}
