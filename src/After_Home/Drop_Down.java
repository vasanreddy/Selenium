package After_Home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		System.out.println(driver.getTitle());
		WebElement ele=driver.findElement(By.xpath("//select[@id='continents']"));
		
		Select select=new Select(ele);
		select.selectByVisibleText("Africa");
		List<WebElement>total=select.getOptions();
		System.out.println("list of values:"+total.size());
		
		for(int i=0;i<total.size();i++){
			System.out.println(total.get(i).getText());
		}
		
	}

}
