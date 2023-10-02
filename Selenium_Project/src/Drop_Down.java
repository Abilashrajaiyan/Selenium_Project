import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abilash\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=User_details%22);");
		WebElement day=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select S=new Select(day);
		S.selectByIndex(4);
		//S.selectByValue("10");
		//S.selectByVisibleText("23");
}}
