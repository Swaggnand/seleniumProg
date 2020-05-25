package seliniumProg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebdriver {
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\saura\\Desktop\\myselenium-java prog\\mindscripts course\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();

	driver.get("http://www.google.com");
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	
	driver.manage().window().maximize();
	
	driver.get("http://www.facebook.com");
	
	driver.navigate().back();
	
	driver.close();
	
	
	
	
	
	}

	
	
}
