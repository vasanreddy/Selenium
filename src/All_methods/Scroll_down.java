package All_methods;

import java.util.concurrent.TimeUnit;

import org.eclipse.jdt.internal.compiler.ast.Argument;
import org.junit.experimental.theories.internal.Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.tupaki.com/");
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		driver.manage().deleteAllCookies();
		driver.findElements(By.xpath("//a[@title='Telugu FIlm Industry Half Year Report'][1]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("scroll(0,3500)");
		js.executeScript("Argument[0]scrollintoview(true);",js);

	}
}
