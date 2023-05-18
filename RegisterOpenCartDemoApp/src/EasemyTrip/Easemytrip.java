package EasemyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Easemytrip {
	
	@Test
	public void Mytrip() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chromenew\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/flight.html");
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
	
	
	
}
}