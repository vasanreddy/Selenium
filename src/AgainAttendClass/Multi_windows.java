package AgainAttendClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi_windows {
	
	//WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

            WebDriver driver=new FirefoxDriver();
            driver.get("https://www.naukri.com/");
            driver.manage().window().maximize();
            String Title=driver.getTitle();
            System.out.println(Title);
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            String Main_window=driver.getWindowHandle();
            driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2017/hc-ns-120x45-2982017.gif']")).click();
            Set<String>windowname=driver.getWindowHandles();
            System.out.println("Number of windows"+windowname.size());
            
            
            String window1=(String)windowname.toArray()[0];
            System.out.println("first window"+window1);
            String window2=(String)windowname.toArray()[1];
            System.out.println("second window "+window2);
            
            for(String name:windowname){
            	//System.out.println("Number of windows"+windowname.size());
            	if(name.equalsIgnoreCase(window2)){
            		
            		driver.switchTo().window(window2);
            		System.out.println(driver.getTitle());
            	}
            driver.switchTo().window(Main_window);
            }
            
            driver.quit();
	
	
	}

}
