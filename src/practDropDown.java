import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Utham");
		driver.findElement(By.name("email")).sendKeys("Utham@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("utham@123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText("Female");
		Thread.sleep(500);
		dropdown.selectByVisibleText("Male");
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		driver.findElement(By.name("bday")).sendKeys("02/02/1992");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		
	}

}
