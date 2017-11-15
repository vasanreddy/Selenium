package Aug_practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
	    driver.get("http://www.users.miamioh.edu/reajt/practice3/basics/popupBoxes.html");
	    Alert alert=driver.switchTo().alert();
	    alert.accept();
	    Thread.sleep(4000);
	     driver.findElement(By.xpath("//input[@value='Show confirm box']")).click();
	     alert.dismiss();
	     Thread.sleep(4000);
	    System.out.println(alert.getText());
	    alert.accept();
	}

}
