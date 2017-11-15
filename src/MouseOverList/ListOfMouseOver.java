package MouseOverList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ListOfMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement element = driver.findElement(By.xpath("//span[text()='Men']"));
	Actions act = new Actions(driver);
	act.moveToElement(element).perform();
	
	List <WebElement> no_of_ele=driver.findElements(By.xpath("//li[@class='Wbt_B2'][3]//following::ul[@class='_3GtRpC']/li"));
	System.out.println(no_of_ele.size());
    for(int i=0;i<no_of_ele.size();i++)
    {
    	System.out.println(no_of_ele.get(i).getText());
    	
    	System.out.println("naresh");
    	
    	if(no_of_ele.get(i).getText().equalsIgnoreCase("Boots"))
    	{
    		Thread.sleep(3000);
    		System.out.println("hello");
    		no_of_ele.get(i).click();
    		Thread.sleep(3000);
    		System.out.println("element is clicked");
    		break;
    		
    	}
    }
	
	}

}
