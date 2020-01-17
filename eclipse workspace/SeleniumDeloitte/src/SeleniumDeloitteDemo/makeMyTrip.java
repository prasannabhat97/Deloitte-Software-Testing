package SeleniumDeloitteDemo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://eclipse workspace//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector("#SW > div.landingContainer > div.makeFlex.hrtlCenter.prependTop5.appendBottom40 > ul > li.makeFlex.hrtlCenter.font10.makeRelative.lhUser > div > p")).click();
		driver.findElement(By.cssSelector("#username")).sendKeys("deloittetraining@gmail.com");
		

	
		
	}
}
