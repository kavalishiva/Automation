package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SFCreate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Zapcom\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("surendra9863258@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("Batch131QA@123");
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(12500);
		
		driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//span[@class='slds-align-midle' and starts-with(text(),'User')]")).click();
		 Thread.sleep(12500);
		 
		 WebElement fr1=driver.findElement(By.xpath("//iframe[@title='New User ~ Salesforce - Developer Edition']"));
		 driver.switchTo().frame(fr1);
		 
		 driver.findElement(By.id("Email")).sendKeys("test");
		 
		 Thread.sleep(6500);
		 driver.quit();
		 
		 
	}

}
