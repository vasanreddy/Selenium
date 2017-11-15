package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class VerifyLinks {
	
	public static int count =0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are:"+links.size());
		
		for(int i=0;i<links.size();i++)
		{
		WebElement ele=	links.get(i);
		String url =ele.getAttribute("href");
		verifyLinkActive(url);
		
		}
	}
	
	public static void verifyLinkActive(String linkURL)
	{
		
		try
		{
		URL url = new URL(linkURL);
		
		HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
		
		httpurlconnection.setConnectTimeout(3000);
		
		httpurlconnection.connect();
		
		if(httpurlconnection.getResponseCode()==200)
		{
			System.out.println(linkURL+ " - " +httpurlconnection.getResponseMessage());
		}
		if(httpurlconnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			 
		System.out.println(linkURL+ " - "+httpurlconnection.getResponseMessage()+" - "+HttpURLConnection.HTTP_NOT_FOUND);
		count ++;
		}
		
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("no of urls" +count);
	}
}
