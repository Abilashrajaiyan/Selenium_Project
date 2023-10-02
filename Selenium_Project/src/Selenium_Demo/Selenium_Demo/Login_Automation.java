package Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Automation {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abilash\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(3000);
		WebElement Username=driver.findElement(By.id("username"));
		Username.sendKeys("Abilash04");
		Thread.sleep(3000);
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("Samsungabilash4");
		Thread.sleep(3000);
		WebElement Click=driver.findElement(By.id("login"));
		Click.click();
}}
		

