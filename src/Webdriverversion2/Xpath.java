package Webdriverversion2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.videocond2h.com/wsc/index.aspx");
		driver.findElement(By.xpath("//span[@id='rchg']//following::span")).click();
		//driver.findElement(By.xpath("//span[@id='rchg']//following::span[2]")).click();
		driver.findElement(By.xpath("//a[text()='Long Term Recharge for']//preceding::a")).click();
		System.out.println("dipaly the recharge ");
		//Preceding
		//Thread.sleep(7000);
		String text=driver.findElement(By.xpath("//td[text()='Platinum HD']//preceding::td[7]")).getText();
		System.out.println("text value is:"+text);
		driver.findElement(By.xpath("//span[@id='multi']//following::span")).click();
		System.out.println("Direct to mobile");
		driver.findElement(By.xpath("//span[@id='rchg']//preceding::span[2]")).click();
		System.out.println("book now");
		
	}

}
