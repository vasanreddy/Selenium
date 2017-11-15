package practiesWebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		System.out.println("open site data="+driver.getTitle());
		WebElement element=driver.findElement(By.cssSelector("[class='nav-search-dropdown searchSelect']"));
		Select sel=new Select(element);
		sel.selectByVisibleText("Beauty");
		List<WebElement>Beauty=sel.getOptions();
		System.out.println("total beaty data="+Beauty.size());
		for(int i=1;i<Beauty.size();i++){
		System.out.println(Beauty.get(i).getText());
		}
		

	}

}
