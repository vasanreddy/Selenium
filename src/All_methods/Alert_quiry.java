package All_methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_quiry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new FirefoxDriver();
     driver.get("http://www.users.miamioh.edu/reajt/practice3/basics/popupBoxes.html");
     Alert  alert=driver.switchTo().alert();
     alert.accept();
     driver.findElement(By.xpath("//input[@onclick='show_prompt()']")).click();
     
     Thread.sleep(5000);
     //alert.dismiss();
     alert.accept();
    
	}

}
