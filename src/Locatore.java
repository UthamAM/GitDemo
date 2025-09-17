import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locatore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
//		String name = "rahul";
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//     	driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.id("inputUsername")).sendKeys(name);
//		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//	    driver.findElement(By.className("signInBtn")).click();
//	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//		//driver.findElement(By.linkText("Forgot your password?")).click();
//	    //getPassword(driver);
//		Locatore p = new Locatore();
//		String pass = p.getPassword(driver);
//	    Thread.sleep(1000);
//		//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Utham");
//		//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Utham@gmail.com");
//		//driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//		//driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Utham12@gmail.com");
//		//driver.findElement(By.xpath("//form/input[3]")).sendKeys("9875645376");		
//		//driver.findElement(By.className("reset-pwd-btn")).click();
//		//System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys(pass);
//		driver.findElement(By.id("chkboxOne")).click();
//		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.tagName("p")).getText());
//		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
//		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
//		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
	
				
//		driver.get("https://domo-eload-uat.m1.com.sg/login");
//		Thread.sleep(3000);
//		driver.findElement(By.name("phoneNumber")).sendKeys("BFN1029");
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123Admin@456");
//		driver.findElement(By.cssSelector("div button")).click();

	}
	
//	public  String getPassword(WebDriver driver) throws InterruptedException
//	{
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
//		String Password = passwordText.split("'")[1];
//		
//		return Password;		
		
//	}

}
