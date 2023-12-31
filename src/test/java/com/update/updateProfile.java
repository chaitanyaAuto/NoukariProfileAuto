package com.update;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class updateProfile {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAiAnL-sBhBnEiwAJRGigq6HhQzddyRwt1jdXyyRsIRUhNdk4YnckmBg8N_e-tmrZlPsdwhOqBoCatIQAvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href=\"https://www.naukri.com/nlogin/login\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"usernameField\"]")).sendKeys("chaitanaya.nitya143@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"passwordField\"]")).sendKeys("Nitya@143143");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//button[@data-ga-track=\"spa-event|login|login|Save||||true\"]")).click();
		Thread.sleep(14000);
		
		driver.findElement(By.xpath("(//a[@href=\"/mnjuser/profile\"])[1]")).click();
		Thread.sleep(14000);
		driver.findElement(By.xpath("//div[@class=\"widgetHead\"]//span[@class=\"edit icon\" ]")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[@type=\"submit\" and contains(text(),'Save')]")).click();
		Thread.sleep(9000);
		
		driver.close();
	}
}
