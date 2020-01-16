package SeleniumDeloitteDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class settingSystemProparty {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://eclipse workspace//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.name("q")).sendKeys("online fps games");
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.name("session_key")).sendKeys("prasannabhat97@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("kkkkkkkkkkkk");
		driver.findElement(By.cssSelector("#app__container > main > div > form > div.login__form_action_container > button")).click();
		driver.findElement(By.xpath("/html/body/div/main/div/div[3]/div/a")).click();
	
		//	driver.close();	
	}

}
