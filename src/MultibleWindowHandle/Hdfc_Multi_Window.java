package MultibleWindowHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hdfc_Multi_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/htdocs/common/NetBanking/post-logout.htm");
		driver.manage().window().maximize();
		System.out.println("before launching window:"+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String Parent_Window=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Click here']")).click();
		
		Set<String>s1=driver.getWindowHandles();
		Iterator<String>I1=s1.iterator();
		
		while(I1.hasNext()){
			
			String Child_Window=I1.next();
			if(!Parent_Window.equals(Child_Window)){
			
				driver.switchTo().window(Child_Window);
			     System.out.println("some:"+driver.getTitle());
			     
			}
		}
		
		
		driver.switchTo().window(Parent_Window);
		
		System.out.println("Back the window:"+driver.getTitle());
		
	}

}
