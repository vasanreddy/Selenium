package All_method_09;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi_windows2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	String Parent_window=driver.getWindowHandle();
	driver.findElement(By.xpath("//img[@src='https://bms.naukimg.com/banner/banners2014/srp_banners/cog-120X45-242015.gif']")).click();
	System.out.println(driver.getCurrentUrl());
	Set<String>s1=driver.getWindowHandles();
	Iterator<String>it=s1.iterator();
	while(it.hasNext()){
		
		String Child_window=it.next();
		
		if(!Parent_window.equals(Child_window)){
			driver.switchTo().window(Child_window);
			System.out.println("cjild window"+driver.getTitle());
		}
		driver.switchTo().window(Parent_window);
		System.out.println("back to the parentwindow"+driver.getTitle());
	}
     driver.quit();
	}
}
