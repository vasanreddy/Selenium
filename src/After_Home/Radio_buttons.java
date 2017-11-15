package After_Home;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_buttons {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File ("c://My Data//print//screen1.png"));
		List<WebElement>check=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(check.size());
		
		for(int i=0;i<check.size();i++){
			//System.out.println(check.get(i).getText());
			System.out.println(check.get(i).getAttribute("value"));
			if(check.get(i).getAttribute("value").equals("Selenium IDE")){
			check.get(i).click();
			break;
			}
			
			}
	
	driver.quit();
	}

}
