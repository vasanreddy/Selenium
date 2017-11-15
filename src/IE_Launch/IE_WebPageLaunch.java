package IE_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_WebPageLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","C://My Data//browsers//IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		Thread.sleep(4000);
        driver.get("https://accounts.google.com/signin");
        //driver.manage().window().maximize();
        
       // driver.manage().
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
	}

}
