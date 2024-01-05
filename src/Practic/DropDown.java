package Practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d= new ChromeDriver();
		d.navigate().to("https://the-internet.herokuapp.com/");
		
		
		d.findElement(By.linkText("Dropdown")).click();
		
		
		
		WebElement list = d.findElement(By.xpath("//select[@id='dropdown']"));
		
	Select s= new Select(list);
	s.selectByIndex(2);
	}

}
