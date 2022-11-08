package assignment_oct23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook_validation {

		
		public static WebDriver driver;
		

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.facebook.com/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
	    	String ActualCurrentUrl = "https://www.facebook.com/";
			String ActualTitle = "Facebook - log in or sign up";
			String ExpectedCurrentUrl = driver.getCurrentUrl();
			String ExpectedTitle = driver.getTitle();

			if(ActualTitle.equals(ExpectedTitle) && ActualCurrentUrl.equals(ExpectedCurrentUrl)){
			System.out.println("My url is correct");
			}else {
			System.out.println("My url is not correct");
			}

			WebElement createNewAccount = driver.findElement(By.xpath("//div[@class = '_6ltg'][2]"));
			if(createNewAccount.isEnabled() == true && createNewAccount.isDisplayed() == true) {
				createNewAccount.click();
			}else {
			System.out.println("The link is not working");
			}
			WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@name ='firstname']"));
			if(firstNameTextBox.isEnabled() == true && firstNameTextBox.isDisplayed() == true) {
			firstNameTextBox.sendKeys("Anna");
			}else {
			System.out.println("The firstNameTextBox field is not enabled or displayed");
			}

			WebElement lastNameTextBox = driver.findElement(By.xpath("//input[@name ='lastname']"));
			if(lastNameTextBox.isEnabled() == true && lastNameTextBox.isDisplayed() == true) {
			lastNameTextBox.sendKeys("Safari");
			}else {
			System.out.println("The lastName TextBox field is not enabled or displayed");
			}

			WebElement mobileNumberorEmailButton = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
			if(mobileNumberorEmailButton.isEnabled() == true && mobileNumberorEmailButton.isDisplayed() == true) {
			mobileNumberorEmailButton.sendKeys("703223");
			}else {
			System.out.println("The mobileNumberorEmailButton is not enabled or displayed");
			}

			WebElement newPasswordButton = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
			if(newPasswordButton.isEnabled() == true && newPasswordButton.isDisplayed() == true) {
			newPasswordButton.sendKeys("Anna123");
			}else {
			System.out.println("The newPasswordButton is not enabled or displayed");
			}
		}

			}

			
		




	


