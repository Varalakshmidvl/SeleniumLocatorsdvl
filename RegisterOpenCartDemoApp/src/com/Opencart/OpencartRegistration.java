package com.Opencart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpencartRegistration {
   // WebDriver driver = new ChromeDriver();
	@Test
	public void LaunchOpencart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chromenew\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Varalakshmi");
		driver.findElement(By.name("lastname")).sendKeys("DVL");
		driver.findElement(By.name("email")).sendKeys("varalakshmi.doddi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("DVLDVL66@@");
		Thread.sleep(2000);
				//driver.findElement(By.id("input-newsletter-yes")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.name("agree")).click();
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	     Thread.sleep(2000);
	     System.out.println("hicheckbox");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		
	}

	}
