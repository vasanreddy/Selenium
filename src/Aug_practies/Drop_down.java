package Aug_practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://My Data//browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://www.amazon.in/");
		WebElement ele=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Thread.sleep(3000);
		Select sel=new Select(ele);
		sel.isMultiple();
		List<WebElement>list=sel.getOptions();
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
			
			//driver.close();
		}
driver.close();
	}

}
