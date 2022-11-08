package assignmentoct9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser19 {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mac.com");
		driver.manage().window().maximize();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://dior.com");
		driver1.manage().window().maximize();
		
		driver.quit();
		driver1.quit();
		
		
		

	}

}
