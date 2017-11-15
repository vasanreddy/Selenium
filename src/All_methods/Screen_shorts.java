package All_methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screen_shorts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//System.setProperty("webdriver.chrome.driver","C://My Data//browsers//chromedriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Sample1\\Screen.png"));
		System.out.println("print the copy ");
		driver.close();
			
	

}
}
