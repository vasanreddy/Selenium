package Logics;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindow_logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String Parent_window=driver.getWindowHandle();
        driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2017/hc-ns-120x45-2982017.gif']")).click();
        System.out.println(driver.getTitle());
	    Set<String>windowname=driver.getWindowHandles();
	    System.out.println(windowname.size());
	    
	    
	    String window1=(String)windowname.toArray()[0];
	    System.out.println(windowname.toArray()[0]);
	    String window2=(String)windowname.toArray()[1];
	    System.out.println(windowname.toArray()[1]);
	    String window3=(String)windowname.toArray()[2];
	    System.out.println(windowname.toArray()[2]);
	    String window4=(String)windowname.toArray()[3];
	    System.out.println(windowname.toArray()[3]);
	    
	    String window5=(String)windowname.toArray()[4];
	    System.out.println(windowname.toArray()[4]);
	    
	    
	/*    for(int i=0;i<windowname.size();i++){
	    	
	    	if(!Parent_window.equals(window5)){
	    		
	    		
	    		driver.switchTo().window(window5);
	    	System.out.println("third window"+driver.getTitle());
	    	}	
	    }
	    driver.switchTo().window(Parent_window);*/
	   
	    
	   for(String name:windowname){
	 
	    	if(name.equalsIgnoreCase(window5)){
	    		
	    		driver.switchTo().window(window5);
	    		System.out.println(driver.getTitle());
	    	}
	    	driver.switchTo().window(Parent_window);
	    
	    }
	
          driver.quit();
	}

}
