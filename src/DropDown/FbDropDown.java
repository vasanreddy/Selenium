		package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	   WebElement element=driver.findElement(By.cssSelector("#day"));
	   
	   Select select =new Select(element);
	   //select.selectByValue("13");
	  // select.getFirstSelectedOption();
	   select.getAllSelectedOptions();//
	   String day=select.getFirstSelectedOption().getText();
	   System.out.println("defafult value:" + day );
	   
	   
	  // System.out.println("number of days:"+day.size());
	
	   //for(int i=1;i<day.size();i++){
		 //  System.out.println(day.get(i).getText());
	   //}

	}
	

}
