package practiesWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListofLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=CFxBWcT0K-zI8Afkur2IDQ");
		System.out.println("open web age:"+driver.getTitle());
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		System.out.println("total web element="+ele.size());
      // driver.findElement(By.xpath("//a[@href='https://www.google.co.in/intl/en/options/'and @title='Google apps']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[@href='https://www.google.co.in/intl/en/options/'and @title='Google apps']")))).click();
		//System.out.println("total email element:="+ele1.size());
		System.out.println("page oen agai:");
        driver.navigate().back();
        //driver.findElement(By.xpath("//a[text()='Gmail']//following::c")).click();
        
        
	}

}
