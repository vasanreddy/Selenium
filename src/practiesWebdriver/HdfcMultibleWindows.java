package practiesWebdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcMultibleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://My Data//browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.hdfcbank.com/htdocs/common/NetBanking/post-logout.htm");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		String parent_window=driver.getWindowHandle();
		System.out.println("before swiching window="+driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='Click here']")).click();
		Set<String>S1=driver.getWindowHandles();
		System.out.println("no of windows="+S1.size());
		
		Iterator<String> it=S1.iterator();
		while(it.hasNext())
		{
		
			String child=it.next();
			if(!parent_window.equals(child)){
				
				System.out.println("After switching window="+driver.getTitle());
				//driver.close();
			}
		}
		
		
		driver.switchTo().window(parent_window);
		System.out.println("Back switching window="+driver.getTitle());
		driver.quit();
		
	}

}
