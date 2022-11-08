package assignment_oct22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Money_xpath {
	public static WebDriver driver;
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/index.html");
		driver.findElement(By.xpath("//input[@id = 'srchword']")).sendKeys("Financial Results");
		driver.findElement(By.xpath("//div[@class = 'HighlightRow']")).click();
		driver.findElement(By.xpath("//input[contains(@class, 'msprite btn_srch)]")).click();
		
		

	}

}
