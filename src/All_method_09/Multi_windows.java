package All_method_09;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi_windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String Parent_window=driver.getWindowHandle();
	driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2016/ibm-120X45-882016.gif']")).click();
	System.out.println(driver.getCurrentUrl());
	Set<String>s1=driver.getWindowHandles();
	System.out.println(s1.size());
	Iterator<String>t1=s1.iterator();
	while(t1.hasNext()){
		
		String Child_window=t1.next();
		if(!Parent_window.equals(Child_window)){
			driver.switchTo().window(Child_window);
			System.out.println(driver.getTitle());
		}
	driver.switchTo().window(Parent_window);
	System.out.println("revert back parent window"+driver.getTitle());
	
	}
	
	
	

	
	
	}

}
