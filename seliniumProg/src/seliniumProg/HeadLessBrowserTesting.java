package seliniumProg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowserTesting {

	public static void main(String[] args) {
		
		WebDriver driver = new HtmlUnitDriver();
		System.out.println("Execution Starts.....");
		driver.get("http://www.google.com");
	
        //driver.get("http://www.Facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("Execution End....");
		
	}

}
