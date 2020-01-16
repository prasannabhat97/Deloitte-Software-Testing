package SeleniumDeloitteDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class NewTestNG {
	
	public String baseUrl="https://google.com";
	@Test
	public void verifyHomePage() {
		System.out.println("Lounching Chrome !!");
		System.setProperty("webdriver.chrome.driver", "E://eclipse workspace//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(baseUrl);
		String expected="Google";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		
	}
}
