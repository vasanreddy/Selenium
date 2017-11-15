package MultibleWindowHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String parent_window=driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2017/hc-ns-120x45-762017.gif']")).click();
		System.out.println(driver.getCurrentUrl());
		Set<String> s1=driver.getWindowHandles();
		System.out.println("size of the multi window"+s1.size());
		Iterator<String>it=s1.iterator();
		while(it.hasNext()){
			
			String Child_window=it.next();
			
			if(!parent_window.equals(Child_window)){
				
				driver.switchTo().window(Child_window);
				System.out.println("child window:"+driver.getTitle());
				
			}
		
		   driver.switchTo().window(parent_window);
		   System.out.println("bck the parent window:"+driver.getTitle());
		  //driver.quit();
		}
		
		
		
	}

}
