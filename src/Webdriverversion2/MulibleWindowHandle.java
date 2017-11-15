package Webdriverversion2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MulibleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String title=driver.getTitle();
		System.out.println("open the webpage ");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2017/gen-120X45-452017.gif']")).click();
		/*Set<String> allwin=driver.getWindowHandles();
		System.out.println("no of windows:"+allwin.size());
		for (String s:allwin)
		{
			System.out.println(s);
		}
		
       String parent=(String)allwin.toArray()[0];
       String child1=(String)allwin.toArray()[1];
       String child2=(String)allwin.toArray()[2];
       String child3=(String)allwin.toArray()[3];
       driver.switchTo().window(child1);
       Thread.sleep(5000);
       String title1=driver.getTitle();
       System.out.println(title1);
       driver.close();
       driver.switchTo().window(child2);
       Thread.sleep(5000);
       String title2=driver.getTitle();
       System.out.println(child2);
       Thread.sleep(5000);
       String title3=driver.getTitle();
       System.out.println(child3);*/
       driver.findElement(By.xpath("//area[@shape='circle' and @coords='61,16,14']")).click();
       //driver.findElement(By.xpath("//img[@src='https://companies.naukri.com/genpactnew/wp-content/uploads/sites/4294/2015/10/genpact.png']")).click();
       //driver.findElement(By.xpath("//a[text()='Jobs']//following::a[1]")).click();
       Thread.sleep(3000);
       driver.switchTo().window("parent");
       driver.quit();
       
    		   
	}

}
