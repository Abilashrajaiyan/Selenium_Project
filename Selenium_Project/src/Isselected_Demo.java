import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected_Demo {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abilash\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		//System.out.println(driver.findElement(By.id("checkbox1")).isSelected());
		//System.out.println(driver.findElement(By.id("but1")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@class='gsc-search-button]")).isDisplayed());
		
	
		
}
}