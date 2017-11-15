package Webdriverversion2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://My Data//browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("title of webpage");
		
		WebElement element=driver.findElement(By.cssSelector("#day"));
		Select sel=new Select(element);
		sel.selectByValue("5");
		List<WebElement>day=sel.getOptions();
		System.out.println("total day value:"+day.size());
		
		for(int i=0;i<day.size();i++){
			
			System.out.println(day.get(i).getText());
		}
		
        WebElement element1=driver.findElement(By.cssSelector("#month"));
		Select sele=new Select(element1);
		sele.selectByValue("9");
		List<WebElement> month=sele.getOptions();
		System.out.println("total month value:"+month.size());
		
		for(int i=0;i<month.size();i++){
			
		System.out.println(month.get(i).getText());
		}
		
		
		WebElement element2=driver.findElement(By.cssSelector("#year"));
		Select select=new Select(element2);
		select.selectByValue("2009");
		List<WebElement>year=select.getOptions();
		System.out.println("total year value:"+year.size());
		
		for(int i=0;i<year.size();i++){
			
			System.out.println(year.get(i).getText());
		}
		
		

	}
}

