package com.Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginpage {

	
	@Test
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chromenew\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("Varalakshmi.d@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("chnchn23");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
}
}