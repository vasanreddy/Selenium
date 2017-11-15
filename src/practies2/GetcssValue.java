package practies2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Assert;

public class GetcssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
       WebElement ele= driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']"));
	    System.out.println(ele.getCssValue("background-coloure"));
	    
        WebDriverWait wait=new WebDriverWait(driver,20);
       // wait.until(ExpectedConditions.)
	    
	}

}
