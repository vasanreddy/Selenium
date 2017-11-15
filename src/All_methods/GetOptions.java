package All_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.tirumala.org/advancebooking.aspx");
		WebElement text=driver.findElement(By.xpath("//a[text()='Temples']"));
		System.out.println("priting"+text);
	
		//System.out.println(driver.getTitle());
	}

}
