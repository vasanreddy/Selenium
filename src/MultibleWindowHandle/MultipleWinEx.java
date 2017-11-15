package MultibleWindowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultipleWinEx {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='https://company.naukri.com/banners2017/gen-120X45-452017.gif']")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println("no of windows:"+allwin.size());
		for (String s:allwin)
		{
			System.out.println(s);
		}
        String parent = (String) allwin.toArray()[0];
        String chaild1 = (String) allwin.toArray()[1];
        String chaild2 = (String) allwin.toArray()[2];
        String chaild3 = (String) allwin.toArray()[3];
		driver.switchTo().window(chaild1);
		Thread.sleep(5000);
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.close();
		driver.switchTo().window(chaild2);
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
      driver.switchTo().window(chaild3);
      Thread.sleep(5000);
      String title2=driver.getTitle();
      System.out.println(title2);
      driver.findElement(By.xpath("//a[text()='People']")).click();
      Thread.sleep(3000);
      driver.switchTo().window(parent);
      driver.quit();

	}

}
