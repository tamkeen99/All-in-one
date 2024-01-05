package Practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d= new ChromeDriver();
		d.navigate().to("https://the-internet.herokuapp.com/");
		
		d.findElement(By.linkText("Frames")).click();
		
		d.findElement(By.linkText("iFrame")).click();
		
WebElement frame = d.findElement(By.id("mce_0_ifr"));
d.switchTo().frame(frame);
d.findElement(By.xpath("//body[@class='mce-content-body ']")).clear();
d.findElement(By.xpath("//body[@class='mce-content-body ']")).sendKeys("hyyy");
	}

}
