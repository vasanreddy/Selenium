package AutoIT_script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_webPopUps {
	
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://tinypic.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='the_file']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\krish\\Desktop\\fp.exe");
		
	
	}
		
		
		

}
