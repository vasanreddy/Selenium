package practiesWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  
		//System.setProperty("webdriver.chrome.driver","C://My Data//Selenium//browsers//chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://app.easybiodata.com/#/signup-auth");
		//driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#userFullName")))).sendKeys("srini");
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-empty ng-invalid ng-invalid-required ng-valid-minlength ng-valid-maxlength ng-touched']")).sendKeys("Srinivaas");
		
		//WebElement element=driver.findElement(By.cssSelector("#userRelation"));
		//Select sel=new Select(element);
		//sel.selectByVisibleText("Son");
		
	
	}
		

}
