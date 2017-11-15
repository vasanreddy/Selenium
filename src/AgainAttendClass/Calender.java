package AgainAttendClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.abhibus.com/operator/919/APSRTC");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		List<WebElement>elements=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
		
		for(int i=0;i<elements.size();i++){
			System.out.println(elements.get(i).getText());
			
			if (elements.get(i).equals("21")){
				
				elements.get(i).click();
				break;
			}
		}
		

	}

}
