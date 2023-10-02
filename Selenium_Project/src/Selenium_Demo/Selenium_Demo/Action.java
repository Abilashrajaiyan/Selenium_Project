package Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abilash\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://corporate.spicejet.com/Default.aspx");
		 Actions act = new Actions(driver);
		 Thread.sleep(4000);
		 act.moveToElement(driver.findElement(By.xpath("//a[@id='ct100_HyperLinkLogin'"))).build().perform();
		 act.doubleClick(driver.findElement(By.linkText("(Travel Agent Login"))).build().perform();
		 Thread.sleep(4000);
		
}}
