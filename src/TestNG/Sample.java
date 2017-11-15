package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	FirefoxProfile profile=new FirefoxProfile();
	profile.setAcceptUntrustedCertificates(false);
	WebDriver driver=new FirefoxDriver(profile);
	
	
	}

}
