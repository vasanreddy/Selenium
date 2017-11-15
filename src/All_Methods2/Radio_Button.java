package All_Methods2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        List<WebElement> ele=driver.findElements(By.xpath("//input[@type='radio']"));
        //System.out.println("list of radio buttons:"+ele.size());
        
        for(int i=0;i<ele.size();i++){
        	
        	System.out.println("data:"+ele.get(i).equals("value"));
        	
        	//ele.get(i).click();
        	
        	Thread.sleep(4000);
        	if(ele.get(i).getAttribute("value").equalsIgnoreCase("Male"))
        	{
        	    
                 ele.get(i).click();
        	
        	     break;
        	}
       }
        
	
	
	}

}
