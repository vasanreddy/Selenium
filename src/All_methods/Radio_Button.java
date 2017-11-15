package All_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		WebDriver driver =new FirefoxDriver ();
		driver.navigate().to("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String title=driver.getTitle();
		System.out.println(driver.getTitle());
		
		List<WebElement> ele=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("list of elements"+ele.size());
		
		for(int i=0;i<ele.size();i++){
			System.out.println(ele.get(i).getAttribute("value"));
			System.out.println(ele.get(i).getAttribute("value").equals("MultiCity"));
			System.out.println(ele.get(i).isSelected());
			ele.get(i).click();
			System.out.println(ele.get(i).isSelected());
		
		}
		
		driver.close();

		
	}

}
