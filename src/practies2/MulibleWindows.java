package practies2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MulibleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2017/hc-ns-120x45-572017.gif']")).click();
		String parent_window=driver.getWindowHandle();
	   System.out.println("launch the parent window"+driver.getTitle());
		Set<String>s1=driver.getWindowHandles();
	    System.out.println("no of windows"+s1.size());
	    
	    Iterator<String>it=s1.iterator();
	   
	    while(it.hasNext())
	         {
	    	//System.out.println(it.next());
	    	String child_window=it.next();
	    	
	    	if(!parent_window.equals(child_window))
	    	{	
	    	driver.switchTo().window(child_window);
	    	System.out.println("After launching the window"+driver.getTitle());
	    	}
	    	driver.switchTo().window(parent_window);
			System.out.println("back to parent window"+driver.getTitle());
	
	    }
		
	}

}
