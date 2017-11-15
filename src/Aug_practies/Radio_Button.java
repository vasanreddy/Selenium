package Aug_practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cleartrip.com/");
		System.out.println(driver.getTitle());
		List<WebElement>list=driver.findElements(By.xpath("//input [@type='radio']"));
		System.out.println("list of radibuttons"+list.size());
		
		for(int i=0;i<list.size();i++){
			
			//System.out.println(list.get(i).getText());
			
			System.out.println(list.get(i).getAttribute("value"));
			
			if(list.get(i).getAttribute("value").equals("MultiCity")){
			
				list.get(i).click();
				
				break;
			}
		}

	}

}
