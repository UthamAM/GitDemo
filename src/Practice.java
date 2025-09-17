import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://domo-eload-uat.m1.com.sg/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div/h3")).getText();
		System.out.println(text);
		System.out.println(driver.findElement(By.cssSelector("div p")).getText());
		driver.findElement(By.cssSelector("p[class*='text-custum-orange-500']")).click();
		System.out.println(driver.findElement(By.xpath("//div/h3[contains(@class, 'text-3xl')]")).getText());
		//("div h3[class*='text-3xl']") -- cssselector for above
		driver.findElement(By.cssSelector("input[name='uname']")).sendKeys("BFN1029");
		driver.findElement(By.xpath("//input[@name='uMobileNumber']")).sendKeys("74563576");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.cssSelector("span svg.cursor-pointer")).click();
		//driver.findElement(By.cssSelector("div[class*='Select__dropdown-indicator']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("BFN1029");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123Admin@456");
		driver.findElement(By.cssSelector("div button")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.findElement(By.xpath("//div/input[1]")).sendKeys("0");
		driver.findElement(By.cssSelector("div input:nth-child(2)")).sendKeys("0");
		driver.findElement(By.xpath("//div/input[3]")).sendKeys("0");
		driver.findElement(By.xpath("//div/input[4]")).sendKeys("0");
		driver.findElement(By.xpath("//div/input[5]")).sendKeys("0");
		driver.findElement(By.xpath("//div/input[6]")).sendKeys("0");
		driver.findElement(By.xpath("//button[text()='Verify']")).click();
		Thread.sleep(2000);
		WithotPunchin(driver);
	}
	
	public static void WithotPunchin(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//div/span[@class='retailer-menu-item '][1]")).click();
		// -- ("//div/span[@class='retailer-menu-item '][1]") 
		// -- ("div span[class='retailer-menu-item ']")
		// -- ("//div[@class='flex flex-col gap-3']/span[@class='retailer-menu-item '][2]")
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='All-in-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='block'] div:nth-child(6) button")).click();
		driver.findElement(By.name("retailerMobNumber")).sendKeys("64412111");
		driver.findElement(By.xpath("//button[text()='Proceed to pay']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Okay']")).click();
		driver.findElement(By.xpath("//button[text()='Okay']")).click();
		driver.findElement(By.cssSelector("div[class='flex flex-col gap-3']:nth-child(8) span:nth-child(2)")).click();
	}

}
