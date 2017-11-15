package Handle_Https_Website_In_selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Http_Broken_Links {
      public static int count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	    driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size()-1;i++){
			WebElement ele=links.get(i);
		    String url=ele.getAttribute("href");
		      verifyLinkActive(url);
			//System.out.println(links.get(i).getText());
			
		}
		//driver.close();
	}

	private static void verifyLinkActive(String url) {
		// TODO Auto-generated method stub
		
	try
	{
	URL ur=new URL(url);
	HttpURLConnection httpURLConection=(HttpURLConnection)ur.openConnection();
	httpURLConection.setConnectTimeout(3000);
	httpURLConection.connect();
	
	if(httpURLConection.getResponseCode()==200){
		System.out.println(httpURLConection.getResponseMessage());
	}
	if
		
    (httpURLConection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
	{	
	System.out.println(url+" - "+httpURLConection.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
	count++;
	}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println("no of urls" +count);

   }

}
