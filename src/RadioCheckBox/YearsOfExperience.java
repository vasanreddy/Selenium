package RadioCheckBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YearsOfExperience {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    List<WebElement> all=driver.findElements(By.xpath("//input[@name='exp']"));
	    System.out.println("total list element:"+all.size());
	    
	    
	    for(int i=0;i<all.size();i++){
	    	//System.out.println("hello");
	    	System.out.println("list of elements:"+all.get(i).getAttribute("value"));
	    	
	    	if(all.get(i).getAttribute("value").equalsIgnoreCase("3"));
	    	{
	    		//System.out.println(all.get(i).isSelected());
	    		//Thread.sleep(4000);
	    		
	    		all.get(i).click();
	    		break;
	    	}
	    }
	    
	
	}

}







//