package Get_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Return_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		String text=driver.findElement(By.xpath("//label[@class='db text-trans-uc tal']")).getText();
        System.out.println("text:"+text);
	}

}
