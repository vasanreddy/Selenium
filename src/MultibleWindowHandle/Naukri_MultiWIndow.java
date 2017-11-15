package MultibleWindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri_MultiWIndow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	      WebDriver driver=new FirefoxDriver();
	        driver.get("https://www.naukri.com/");
	        System.out.println(driver.getTitle());
	        
	        String Parent_window=driver.getWindowHandle(); 
	        driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2017/hc-ns-120x45-762017.gif']")).click();
	        
	        Set<String> s1=driver.getWindowHandles();
	        System.out.println("number of windows"+s1.size());
	        
	        Iterator<String>I1=s1.iterator();
	        
	        while(I1.hasNext()){
	        	
	        	String child_window=I1.next();
	        	
	        if(!Parent_window.equals(child_window))
	        {
	        	
	        	driver.switchTo().window(child_window);
	        	
	        	System.out.println("After launching the window"+driver.getTitle());
	    
	        }
	        driver.switchTo().window(Parent_window);
	        System.out.println("Back to parent window="+driver.getTitle());
	        
	        //driver.quit();
	        
	        	
	        }
	        
	             
		}
	}


