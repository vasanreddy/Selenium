package RadioCheckBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolSqaRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		List<WebElement> ele=driver.findElements(By.xpath("//input[@name='tool']"));
		System.out.println("some value:"+ele.size());
		
		for(int i=0;i<ele.size();i++){
		//System.out.println("hello");
			System.out.println("List of Elements:"+ ele.get(i).getAttribute("value"));
			
			if(ele.get(i).getAttribute("value").equalsIgnoreCase("Selenium Webdriver"))
			
			{
			//System.out.println(ele.get(i).isSelected());
				ele.get(i).click();
			//System.out.println(ele.get(i).isSelected());
				
				break;
			}
		}
		
		
		
		
		////input[@name='tool']
		
	}

}
