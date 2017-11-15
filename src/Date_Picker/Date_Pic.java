package Date_Picker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Date_Pic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.abhibus.com/operator/919/APSRTC");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("journey_date")).click();
		
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("//a[text()='22']"));
		ele.sendKeys("07292015");
		
		
		
		

	}

}
