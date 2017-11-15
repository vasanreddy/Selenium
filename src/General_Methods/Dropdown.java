package General_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		System.out.println(driver.getTitle());
		WebElement ele=driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']"));
		
		
		Select select=new Select(ele);
		System.out.println(select.isMultiple());
		List<WebElement>all=select.getOptions();
		for(int i=0;i<all.size();i++){
			
			System.out.println(all.get(i).getText());
		}
	}

}
