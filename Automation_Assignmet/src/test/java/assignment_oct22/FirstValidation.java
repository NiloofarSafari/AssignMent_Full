package assignment_oct22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstValidation {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.target.com/store-locator/find-stores");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualCurrentUrl = "https://www.target.com/store-locator/find-stores";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualTitle = "Stores Near Me : Target";
		String expectedTitle = driver.getCurrentUrl();
		
		if (actualCurrentUrl.equals(expectedCurrentUrl) && actualTitle.equals(expectedTitle))
			System.out.println("my url is correct");
	     else { 
		System.out.println("my url is not correct"); 
		

	     

	     }
	}
}
