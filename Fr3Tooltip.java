package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fr3Tooltip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Zapcom\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		WebElement fr1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fr1);
		
		String titleValue=driver.findElement(By.id("age")).getAttribute("title"); 
		System.out.println(titleValue);
		
		
		Thread.sleep(6500);
		driver.quit();

	}

}
