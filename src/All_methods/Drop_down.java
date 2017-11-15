package All_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver =new FirefoxDriver ();
	driver.navigate().to("http://toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	String title=driver.getTitle();
	System.out.println(driver.getTitle());
	WebElement ele =driver.findElement(By.xpath("//select[@id='continents']"));
	//System.out.println("list of elements:"+ele.s);
	
	Select select=new Select(ele) ;
	//select.selectByVisibleText("Australia");
	select.selectByIndex(4);
	List<WebElement> li=select.getOptions();
	System.out.println("list of value"+li.size());
	
	for(int i=0;i<li.size()-1;i++){
		
		System.out.println(li.get(i).getText());
	
	}
	
	}

}
