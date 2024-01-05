package Practic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HmrWeb {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		d.findElement(By.name("username")).sendKeys("Admin");
		
		d.findElement(By.name("password")).sendKeys("admin123");
		
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		d.findElement(By.xpath("//span[.='Admin']")).click();
		
		d.findElement(By.xpath("//button[.=' Add ']")).click();
		
		
		WebElement option = d.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("argument[0].click()", option);
	
	
	
}
}