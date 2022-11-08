package assignmentoct9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser17 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://motorola.com");
		driver.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://bmw.com");
		driver1.manage().window().maximize();
		
		driver.quit();
		driver1.quit();
		
	}

}
