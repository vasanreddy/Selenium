package practiesWebdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriMultiWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		System.out.println("title of web page :"+driver.getTitle());
        String Parent_window=driver.getWindowHandle();
        driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2016/ibm-120X45-882016.gif']")).click();
        System.out.println("Before switching title="+driver.getTitle());
        
        Set<String>s1=driver.getWindowHandles();
        
        System.out.println("no of windows:"+s1.size());
        
        Iterator<String>I1=s1.iterator();
        
        while(I1.hasNext()){
        	
        	String Chaild_Window=I1.next();
        	if(!Parent_window.equals(Chaild_Window)){
        		
        		System.out.println("Before switching title:"+driver.getTitle());
        	}
        	
        	
        }
        
        driver.switchTo().window(Parent_window);
        
        driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2017/gen-120X45-452017.gif']"));
        System.out.println("back to parent window="+driver.getTitle());
         
        //driver.quit();
	}

}
