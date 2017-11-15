package Date_Picker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Red_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@class='db text-trans-uc tal']")).click();
		List<WebElement> el=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr/td"));
		System.out.println("total size:"+el.size());
		
		for(WebElement element:el){
			System.out.println(element.getText());
			if(element.getText().equals("26")){
				element.click();
				break;
			}
		}

	}

}
