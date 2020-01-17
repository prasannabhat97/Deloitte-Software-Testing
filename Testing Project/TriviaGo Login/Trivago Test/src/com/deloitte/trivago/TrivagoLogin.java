package com.deloitte.trivago;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrivagoLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://eclipse workspace//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://access.trivago.com/oauth/en-IN/login");
		driver.findElement(By.id("check_email")).sendKeys("prasannabhat97@gmail.com");
		driver.findElement(By.id("login_email_submit")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("login_password")).sendKeys("@Abcdefgh123");
		driver.findElement(By.id("login_submit")).click();
		driver.close();
	}

}
