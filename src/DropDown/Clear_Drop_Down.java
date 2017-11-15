package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Clear_Drop_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
	
		System.out.println(driver.getTitle());
	    WebElement ele=driver.findElement(By.xpath("//select[@name='adults']"));
	    
	    Select select=new Select(ele);
	    select.selectByValue("3");
	    select.selectByValue("6");
	    select.getAllSelectedOptions();
	    WebElement firstele=select.getFirstSelectedOption();
	    System.out.println("The first select option is ::"+firstele.getText());
	    
	    
	    /*if(select.isMultiple()){
	    	System.out.println("select tag allows  multible option ");
	    }
	    else{
	    	System.out.println("Select does not allow multiple selections");
	    }*/
	    /*List<WebElement> total=select.getOptions();
	    System.out.println("total sixe of the ele:"+total.size());
	   
	    for(int i=1;i<total.size();i++){
	    	
	    System.out.println("-------:"+total.get(i).getText());
	    }*/
	}

}
