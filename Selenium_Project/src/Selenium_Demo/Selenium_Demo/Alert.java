package Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert<alert> {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abilash\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		//simple alert
		driver.findElement(By.id("s_alert1"));
		Alert<?> Simple = (Alert<?>) driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(((WebElement) Simple).getText());
		((org.openqa.selenium.Alert) Simple).accept();
		
}}



