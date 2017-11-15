package All_method_09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_list {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 webdriver support the classes called "select".
		 which provides useful method for interacting with select option .
		 user can perform operation on a select dropdown option and also deselct operaion using the below methods 
		 */
	
	System.setProperty("webdriver.chrome.driver","C://My Data//browsers//chromedriver.exe");
	driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("http://www.amazon.in/");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement ele=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	
	Select select=new Select(ele);
	//select.selectByIndex(4);
	select.selectByVisibleText("Baby");
	//select.selectByValue("7");
	List<WebElement>list=select.getOptions();
	System.out.println("list of value"+list.size());
	
	for(int i=0;i<list.size();i++){
		
		System.out.println(list.get(i).getText());
	}
	
	
	
	
	}

}
