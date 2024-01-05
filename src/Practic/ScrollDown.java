package Practic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		
		WebDriver d= new ChromeDriver();
		d.navigate().to("https://www.bbc.com/news");


		d.manage().window().maximize();
JavascriptExecutor j= (JavascriptExecutor)d;
//To scroll down to the end of the webPage
j.executeScript("window.scrollTo(0,document.body.scrollHeight)");




	}

}
