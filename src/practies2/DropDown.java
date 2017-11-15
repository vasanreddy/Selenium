package practies2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    WebDriver driver=new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    WebElement ele=driver.findElement(By.cssSelector("#day"));
    
    Select select=new Select(ele);
    select.selectByValue("5");
    List<WebElement>day=select.getOptions();
    System.out.println("total day elements"+day.size());
   for(int i=0;i<day.size()-1;i++){
    	System.out.println(day.get(i).getText());
    
    }
	driver.close();
	}

}
