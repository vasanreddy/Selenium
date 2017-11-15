package AgainAttendClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/?ie=UTF8&ref_=pd_mn_ABKror78&tag=googinhydmabk-21");
		System.out.println(driver.getTitle());
		WebElement ele=driver.findElement(By.cssSelector("#searchDropdownBox"));
		
		Select select=new Select(ele);
		
		//select.selectByVisibleText("Baby");
		//select.selectByValue("9");//Books
		//select.selectByIndex(7);
		//select.getFirstSelectedOption();
		//select.getAllSelectedOptions();
		//select.deselectAll();
		select.isMultiple();
		select.selectByIndex(10);
		
		Thread.sleep(10000);
		select.selectByVisibleText("Baby");
		
		List<WebElement>Totallist=select.getOptions();
		System.out.println("list of attributes"+Totallist.size());
		
		for(int i=0;i<Totallist.size();i++){
			
			System.out.println(Totallist.get(i).getText());
		}
		
    driver.quit();
	}

}
