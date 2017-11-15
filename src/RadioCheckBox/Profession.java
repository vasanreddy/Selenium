package RadioCheckBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Profession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		List<WebElement> all=driver.findElements(By.xpath("//input[@name='profession']"));
		System.out.println("total numbers:"+ all.size());
		
		for(int i=0;i<all.size();i++){
			
			System.out.println("list of element:"+all.get(i).getAttribute("value"));
			
			if(all.get(i).getAttribute("value").equalsIgnoreCase("Automation Tester"))
			{
					
				all.get(i).click();
				
				break;
			}
			
				
			}
		}
		
		
	}


