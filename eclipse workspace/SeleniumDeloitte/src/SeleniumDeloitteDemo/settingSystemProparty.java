package SeleniumDeloitteDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class settingSystemProparty {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://eclipse//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.name("q")).sendKeys("online fps games");
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.name("session_key")).sendKeys("prasannabhat97@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("kkkkkkkkkkkk");
		
	//	driver.close();	
	}

}
