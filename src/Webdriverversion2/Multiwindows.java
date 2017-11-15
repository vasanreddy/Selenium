package Webdriverversion2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		//string title=driver.getTitle();
		driver.manage().window().maximize();
		
		String Parent_Window=driver.getWindowHandle();
		
		System.out.println("Before switching title="+driver.getTitle());
		
		driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2016/Synechron_120X45_2992016.gif']")).click();

		Set<String>s1=driver.getWindowHandles();
		
		System.out.println("no of windows:"+s1.size());
		
		Iterator<String>I1=s1.iterator();
	
		while(I1.hasNext()){
		
		String child_window=I1.next();
		
		if(!Parent_Window.equals(child_window));
		{
			driver.switchTo().window(child_window);
			
			System.out.println("After switching title is="+driver.getTitle());
			
			//driver.close();
		}
}	
	
		driver.switchTo().window(Parent_Window);
		System.out.println("Back to parent window="+driver.getTitle());
		driver.close();
		
	
	}
}
