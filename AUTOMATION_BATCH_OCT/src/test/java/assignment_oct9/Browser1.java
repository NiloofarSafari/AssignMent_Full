package assignment_oct9;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new firefoxdriver();
		driver1.get("https://facebook.com");
		driver1.manage().window().maximize();
		
		driver.quit();
		driver1.quit();
		
		
		
		
	}

}
