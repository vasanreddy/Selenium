package All_Methods2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multible_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	    System.out.println(" before launching the window:"+driver.getTitle());
	    String parent_window=driver.getWindowHandle();
	    driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2016/Synechron_120X45_2992016.gif']")).click();
	   
	    Set<String>s1=driver.getWindowHandles();
	    System.out.println("number if windows:"+s1.size());
	    Iterator<String>it=s1.iterator();
	    while(it.hasNext()){
	    	//System.out.println(it.next());
	    	String child_window=it.next();
	    	if(!parent_window.equals(child_window)){
	    		
	    		driver.switchTo().window(child_window);
	    		System.out.println(driver.getTitle());
	    	}
	    	
	    	driver.switchTo().window(parent_window);
	    	System.out.println("Back to the parent window:"+driver.getTitle());
	    	//driver.quit();
	    }
	}

}
