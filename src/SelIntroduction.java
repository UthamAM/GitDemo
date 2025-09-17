import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
	
		//ChromeDriver driver = new ChromeDriver(); 
		
		//----Launch Chrome Browser------//
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\utham.muthappa\\Documents\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//----Launch Firefox Browser------//
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\utham.muthappa\\Documents\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
