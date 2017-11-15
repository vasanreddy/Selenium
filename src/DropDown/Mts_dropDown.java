package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mts_dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C://My Data//browsers//chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.mtsindia.in/Tamilnadu/mtalk.html");
		System.out.println(driver.getTitle());
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        //driver.findElement(By.name("select")).click();
       WebElement ele=  driver.findElement(By.id("circle"));
       //System.out.println(ele.getText());
       Thread.sleep(5000);
       Select select=new Select(ele);
        select.selectByIndex(5);
       List<WebElement> country=select.getOptions();
       System.out.println("number of cuuntrys:"+country.size());
       
       for(int i=0;i<country.size();i++){
    	   
    	   System.out.println(country.get(i).getText());
       }
       
	}

}
