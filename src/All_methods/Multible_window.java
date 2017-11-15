package All_methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multible_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		String Parent_window=driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@src='https://bms.naukimg.com/banner/banners2014/srp_banners/cog-120X45-242015.gif']")).click();
		System.out.println("get the title of main window"+driver.getWindowHandle());
		
		Set<String>s1=driver.getWindowHandles();
		System.out.println("no fo windows"+s1.size());
		
		Iterator<String>it=s1.iterator();
		while(it.hasNext()){
			
			String Child_window=it.next();
			System.out.println(it.next());
			if(!Parent_window.equals(Child_window)){
				System.out.println(driver.getTitle());
				
				
				
			}
		}
	
	driver.switchTo().window(Parent_window);
	System.out.println(driver.getTitle());
	driver.quit();
}

}
