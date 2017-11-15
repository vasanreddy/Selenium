package practiesWebdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultiwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new FirefoxDriver();
    
     driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
     
     String Parent_Window=driver.getWindowHandle();
     System.out.println("Before switching title="+driver.getTitle());
     
     driver.findElement(By.xpath("//*[text()='Learn more']")).click();
     
     Set<String>S1=driver.getWindowHandles();
     
     System.out.println("no of windows="+S1.size());
    
     Iterator<String>I1=S1.iterator();
     
     while(I1.hasNext()){
    	 
    	 String Child_Window=I1.next();
    	
    	 if(!Parent_Window.equals(Child_Window)){
    		 System.out.println("After switching title="+driver.getTitle());
    		 
    		 //driver.close();
    	 }
    	 
     }
     
     driver.switchTo().window(Parent_Window);
     System.out.println("back to parent window="+driver.getTitle());
     driver.quit();
     
	}

}
