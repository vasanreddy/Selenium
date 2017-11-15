package prop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Property {

	
	Properties properties ;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Properties prop =new Properties();
		File f=new File(System.getProperty("user.dir")+"\\src\\prop\\property.object");
		
		FileReader obj=new FileReader(f);
		
		prop.load(obj);//https://www.youtube.com/watch?v=ZsDODZFLdGo
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin");
		
		driver.findElement(By.xpath(prop.getProperty("Email"))).sendKeys("srinivass.test");
	}

}
