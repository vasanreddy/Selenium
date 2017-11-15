package Webdriverversion2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Explicitywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("http://www.videocond2h.com/wsc/index.aspx");
		driver.findElement(By.xpath("//span[@id='rchg']//following::span")).click();
		//driver.findElement(By.xpath("//span[@id='rchg']//following::span[2]")).click();
		driver.findElement(By.xpath("//a[text()='Long Term Recharge for']//preceding::a")).click();
		//Preceding
		String text=driver.findElement(By.xpath("//td[text()='Platinum HD']//preceding::td[7]")).getText();
		System.out.println("text value is:"+text);
	}

}
