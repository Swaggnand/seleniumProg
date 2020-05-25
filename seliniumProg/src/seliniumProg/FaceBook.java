package seliniumProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\saura\\Desktop\\myselenium-java prog\\mindscripts course\\selinium-java\\chromedriver_win32\\chromedriver.exe");
	

		WebDriver driver = new ChromeDriver();
		//implicit wait........globalize used...
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
	   // driver.findElement(By.name("email")).sendKeys("shog@.com");
		//driver.findElement(By.name("pass")).sendKeys("shog123");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//driver.findElement(By.xpath("//*[contains(text(), 'Forgotten account')]")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("sharayu");
		driver.findElement(By.name("lastname")).sendKeys("Deshmukh");
		driver.findElement(By.name("reg_email__")).sendKeys("7218753637");
		driver.findElement(By.name("reg_passwd__")).sendKeys("shog123");
		
		/*driver.findElement(By.name("birthday_day")).sendKeys("12");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("april");
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1990");
		
	*/
		
		
		//Dropdown
		
		Select s= new Select(driver.findElement(By.name("birthday_day")));
		//s.selectByIndex(1);
		//s.selectByValue("7");
		s.selectByVisibleText("10");
		
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		s1.selectByIndex(2);
		//s1.selectByVisibleText("9");
		
	//	driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1990");
		
		
		Select s2= new Select(driver.findElement(By.name("birthday_year")));
		s2.selectByIndex(10);
		//s2.selectByValue("1");
		//s2.selectByVisibleText("2");
		
		//radio button
		driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
	
		
	}

}
