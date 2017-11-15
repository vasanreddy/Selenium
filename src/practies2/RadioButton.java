package practies2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
     WebDriver driver=new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get("http://toolsqa.com/automation-practice-form/");
     System.out.println(driver.getTitle());
  /*   WebElement ele=driver.findElement(By.id("tool-0"));
     System.out.println(ele.isSelected());
     ele.click();
     System.out.println(ele.isSelected());*/
     List<WebElement>number=driver.findElements(By.xpath("//input[@name='tool']"));
     System.out.println("list of drop down"+number.size());
     
     for(int i=0;i<number.size();i++){
    	 System.out.println(number.get(i).getAttribute("value"));
    	 Thread.sleep(4000);
    	if(number.get(i).getAttribute("value").equalsIgnoreCase("Selenium Webdriver")){
    	 number.get(i).click();
    	break;
    	}
     }
   
     
	}

}
