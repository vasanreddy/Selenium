package All_Methods2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in/");
        System.out.println(driver.getTitle());
        WebElement ele= driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']"));
        //System.out.println("list of elements"+ele);
        
        Select select =new Select (ele);
        select.selectByIndex(4);
        List<WebElement>all=select.getOptions();
        System.out.println(all.size());
        for(int i=0;i<all.size();i++){
        	System.out.println(all.get(i).getText());
        }
	
	}

}
