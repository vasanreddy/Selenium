package Chrome_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class web_launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://My Data//browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(4000);
        driver.get("https://accounts.google.com/signin");
        //driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
		
		
	}

}
