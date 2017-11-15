package practiesWebdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MonsterMultibleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://www.monsterindia.com/");
		driver.manage().window().maximize();
		System.out.println("title of webpage:"+driver.getTitle());
		String Parent_winow=driver.getWindowHandle();
		//driver.findElement(By.linkText("e Drishyaa IT India Private Limited")).click();
		//driver.findElement(By.xpath("//img[contains(@src,'http://media.monsterindia.com/logos/1596.jpg')]//following::a[1]")).click();
		Set<String>s1=driver.getWindowHandles();
		System.out.println("no of windows="+s1.size());
		Iterator<String>i1=s1.iterator();
		
		while(i1.hasNext()){
			
			String child_window=i1.next();
			
			if(!Parent_winow.equals(child_window)){
				
				System.out.println("after switching data:"+driver.getTitle());
			}
			
		}
		
          driver.switchTo().window(Parent_winow);
          System.out.println("revert back to the parent:"+driver.getTitle());
	}

}
