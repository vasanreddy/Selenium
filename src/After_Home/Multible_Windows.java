package After_Home;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multible_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
    driver.navigate().to("https://www.naukri.com/");
    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
	System.out.println(driver.getTitle());
	String parent_window=driver.getWindowHandle();
	driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2016/ibm-120X45-882016.gif']")).click();
	System.out.println("parent window title");
	Set<String>s1=driver.getWindowHandles();
	System.out.println(s1.size());
	
	Iterator<String>it=s1.iterator();
	while(it.hasNext()){
		
		String Child_window=it.next();
		if(!parent_window.equals(Child_window)){
			System.out.println("Child window"+driver.getTitle());
		}
	 driver.switchTo().window(Child_window);
	
	}
	
driver.switchTo().window(parent_window);
System.out.println("Revert back parent window"+driver.getTitle());
driver.quit();
	}

}
