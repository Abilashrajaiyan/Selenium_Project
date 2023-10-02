import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Demo {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abilash\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[4]/td[1]"));
		System.out.println(table.getText());
		List<WebElement>companyname=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]"));
		for(int i=0;i<companyname.size();i++) {
			System.out.println(companyname.get(i).getText());
		}
}}
