package Practic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Man {

	
	
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d= new ChromeDriver();
		d.navigate().to("https://www.who.int/");
		d.manage().window().maximize();
		//d.findElement(By.xpath("//span[text()='Documentation']")).click();
		
		//d.navigate().back();
		JavascriptExecutor j= (JavascriptExecutor)d;
		j.executeScript("window.scrollBy(0,2000)");

		//d.quit();
	}

}
