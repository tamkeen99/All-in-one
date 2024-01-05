package Practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBOx {
	


	public static void main(String[] args) {
		
		
		WebDriver d= new ChromeDriver();
		d.navigate().to("https://the-internet.herokuapp.com/");
		
		d.findElement(By.linkText("Checkboxes")).click();
		
		
		d.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
}
}