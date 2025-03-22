package Demo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
	
	public static WebDriver  driver;
	
	@Test
	public  void demo() throws Exception {
		
		 WebDriverManager.chromedriver().setup();
		 
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='employeeId']")).sendKeys("user100@gmail.com");
		
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("(//p[text()='Branch'])[1]")).click();
		
		driver.findElement(By.xpath("//*[text()=' Add Branch ']")).click();
		
		Thread.sleep(5000);
		
//		WebElement branchType = driver.findElement(By.xpath("//*[text()='Enter here']"));
		
	}

	@AfterTest
	public void close() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.close();
	
	}
}
