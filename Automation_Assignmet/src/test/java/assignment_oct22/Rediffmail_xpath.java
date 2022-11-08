package assignment_oct22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediffmail_xpath {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@name, 'passwd')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[contains(@name, 'proceed')]")).click();
		

	}

}
