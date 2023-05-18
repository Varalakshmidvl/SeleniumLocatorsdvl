package Naukri;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriTags {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chromenew\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(WebElement ele : allLinks) {
			System.out.println(ele.getText());
			System.out.println(ele.getAttribute("href"));
		}
		List<WebElement> allimages= driver.findElements(By.tagName("img"));
		System.out.println("Total images on this page"+allimages.size());
		
		for(WebElement ele : allimages) {
			System.out.println(ele.getAttribute("src"));
		
		
		
		}
	}
	
		
}
