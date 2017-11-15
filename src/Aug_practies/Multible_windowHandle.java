package Aug_practies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multible_windowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
   WebDriver driver =new FirefoxDriver();
   driver.manage().window().maximize();
   driver.navigate().to("https://www.naukri.com/");
   System.out.println(driver.getTitle());
   String Parent_window=driver.getWindowHandle();
   Thread.sleep(4000);
   WebElement ele=driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2017/hc-ns-120x45-1372017.gif']"));
   ele.click();
   System.out.println("parent window");
   Set<String>s1=driver.getWindowHandles();
   System.out.println(s1.size());
   Iterator<String>it=s1.iterator();
   while (it.hasNext()){
	   
	   String Child_window=it.next();
	   if(!Parent_window.equals(Child_window)){
		  driver.switchTo().window(Child_window) ;
		  System.out.println("child window"+driver.getTitle());
	   }
   }
   
  driver.switchTo().window(Parent_window);
  System.out.println("back to the parent windwo");
  //driver.quit();
	}

}
