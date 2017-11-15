package All_method_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver=new FirefoxDriver();
	     driver.get("http://www.users.miamioh.edu/reajt/practice3/basics/popupBoxes.html");
	     Alert alert=driver.switchTo().alert();
	 	System.out.println(alert.getText());
	 	alert.accept();
	   
	
	
	}

}
