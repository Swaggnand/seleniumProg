package seliniumProg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumChromeDriver {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saura\\Desktop\\myselenium-java prog\\mindscripts course\\selinium-java\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");
		// driver.navigate().back();
		// driver.navigate().refresh();
		// driver.navigate().forward();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());
		// System.out.println(driver.getWindowHandle());

	}

}
