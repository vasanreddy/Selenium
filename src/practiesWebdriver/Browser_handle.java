package practiesWebdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		
		String parent_window=driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2017/gen-120X45-452017.gif']"));
		System.out.println(driver.getWindowHandle());
		System.out.println("size of windoes"+driver.getTitle());
	
		Set<String>s1=driver.getWindowHandles();
	    Iterator<String>it=s1.iterator();
	    while(it.hasNext()){
	    	System.out.println(it.next());
	    	String child_window=it.next();
	    	if(!parent_window.equals(child_window)){
	    		
	    		driver.switchTo().window(child_window);
	    	}
	   
	    }

	    driver.switchTo().window(parent_window);
	    System.out.println("Back for the parent window");
	    
	   // driver.close();
	}

}
