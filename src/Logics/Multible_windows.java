package Logics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multible_windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/htdocs/common/NetBanking/post-logout.htm");
		driver.manage().window().maximize();
		System.out.println("before launching window:"+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    String Parent_Window=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Click here']")).click();
	    //List<String>windowname=driver.getWindowHandles();
	
	}

}
