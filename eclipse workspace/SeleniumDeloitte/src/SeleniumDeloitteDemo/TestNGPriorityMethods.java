package SeleniumDeloitteDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.AfterTest;

@SuppressWarnings("deprecation")
public class TestNGPriorityMethods {

	WebDriver driver;
	public String expected = null;
	public String actual = null;
	public String baseUrl="https://google.com";

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test ");
		System.setProperty("webdriver.chrome.driver", "E://eclipse workspace//chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	}
	@Test
	public void checkTitle() {
		String expected="Instagram";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test ");
		driver.close();
	}

}
