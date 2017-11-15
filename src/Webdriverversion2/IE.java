package Webdriverversion2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.ie.driver","C://My Data//browsers//IEDriverServer.exe");
		WebDriver driver =new InternetExplorerDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=JYxtWd2jNebI8AfSsIjABA");
		driver.getTitle();
	
	}

}
