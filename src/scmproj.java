import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scmproj {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://mcardaccount-staging.m1.com.sg/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("2220 5122");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		int i;
		for (i=1; i<=6; i++) {
			driver.findElement(By.xpath("//input[@type='password']["+i+"]")).sendKeys(String.valueOf(i));
		}
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Top Up']")).click();
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.cssSelector("div[class$='pr-2 subheadingInsideCard']"));
		Thread.sleep(3000);
		String ProductName = "$16 All-in-1 Top-up";
		int j;
		for(j=1; j<=products.size();j++) {
			if (products.get(j).getText().equalsIgnoreCase(ProductName)) {
				driver.findElement(By.xpath("//button[contains(text(), 'ProductName')]//following-sibling::button[contains(text(), 'Buy Now')]")).click();
			}
	
		}
	}

}
