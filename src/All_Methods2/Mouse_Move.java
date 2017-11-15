package All_Methods2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Move {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C://My Data//browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.emirates.com/in/english/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		WebElement ele=driver.findElement(By.xpath("//a[starts-with(@class,'toggle-menu-link')][1]"));
		WebElement ele1=driver.findElement(By.xpath("//*[text()='Manage'][1]"));
		WebElement ele3=driver.findElement(By.xpath("//a[text()='Choose seat']"));
		
		Actions actions=new Actions (driver);
		actions.moveToElement(ele).build().perform();
		actions.moveToElement(ele1).build().perform();
		actions.moveToElement(ele3).click().build().perform();
	}

}
