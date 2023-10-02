
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecute {
public static <javascriptExecutor> void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abilash\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(4000);
        js.executeScript("window.scrollby(0,4000);");
        Thread.sleep(4000);
        js.executeScript("window.scrollby(0,-3000);");
        Thread.sleep(4000);
        js.executeScript("window.scrollto(0,document.body.scrollHeight);");
        Thread.sleep(3000);
        js.executeScript("window.scroll(0,0);");
}}
