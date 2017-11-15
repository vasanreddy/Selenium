package Date_Picker; 

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cleartrip_Date {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//i[@class='icon ir datePicker' and text()='Cal'][1]")).click();
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("c:\\print\\screen.png"));
		System.out.println("copy file");
		List<WebElement> ele=driver.findElements(By.xpath("//table[@class='calendar']//tr//td"));
		System.out.println(ele.size());
		
		Date date=new Date();
		SimpleDateFormat formmate=new SimpleDateFormat();
		String curdate=formmate.format(date);
		System.out.println(curdate);
		
		Calendar calendar=Calendar.getInstance();
				System.out.println("At present calender year"+calendar.get(calendar.YEAR));//
		
		for(WebElement element:ele){
          System.out.println(element.getText());
          
          if(element.getText().equals("30")){
        	  element.click();
        	  break;
          }
		}
		
	}

}
