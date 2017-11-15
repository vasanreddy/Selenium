package AgainAttendClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://My Data//browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		System.out.println(driver.getTitle());
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<checkbox.size();i++){
			System.out.println(checkbox.get(i).getAttribute("value"));
			
			if(checkbox.get(i).getAttribute("value").equalsIgnoreCase("Manual Tester")){
			
				System.out.println(checkbox.get(i).isEnabled());
				
				checkbox.get(i).click();
				
				System.out.println(checkbox.get(i).isDisplayed());
				//break;
				
				
			}
		}

	}

}
