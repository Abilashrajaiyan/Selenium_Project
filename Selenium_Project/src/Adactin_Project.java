import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Project {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abilash\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Username=driver.findElement(By.id("username"));
		Username.sendKeys("Abilash04");
		Thread.sleep(3000);
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("Samsungabilash4");
		Thread.sleep(3000);
		WebElement Click=driver.findElement(By.id("login"));
		Click.click();
		WebElement location=driver.findElement(By.xpath("//select[@name='location']"));
		Select s=new Select(location);
		s.selectByValue("Sydney");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='hotels']")).sendKeys("Hotel Creek");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='room_type']")).sendKeys("Deluxe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='room_nos']")).sendKeys("2 - Two");
		Thread.sleep(2000);
		driver.findElement(By.id("adult_room")).sendKeys("2 - Two");
		Thread.sleep(2000);
		driver.findElement(By.id("child_room")).sendKeys("2 - Two");
		Thread.sleep(2000);
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("radiobutton_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Adactin_Project.executescript("window.scrollby(0,4000");
		Thread.sleep(2000);
		driver.findElement(By.id("first_name")).sendKeys("R");
		Thread.sleep(2000);
		driver.findElement(By.id("last_name")).sendKeys("Abilash");
		Thread.sleep(2000);
		driver.findElement(By.id("address")).sendKeys("Texas,camtown");
		Thread.sleep(2000);
		driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		driver.findElement(By.id("cc_type")).sendKeys("VISA");
		driver.findElement(By.id("cc_exp_month")).sendKeys("January");
		Thread.sleep(2000);
		driver.findElement(By.id("cc_exp_year")).sendKeys("2024");
		driver.findElement(By.id("cc_cvv")).sendKeys("138");
		Thread.sleep(2000);
		driver.findElement(By.id("book_now")).click();
		
		
	
		
		
		
		
		
		
		
		
}

private static void executescript(String string) {
	// TODO Auto-generated method stub
	
}}
		

