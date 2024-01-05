package Practic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfiniteScroll {

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
		}
		public static void main(String[] args) {
			
			WebDriver d= new ChromeDriver();
			d.navigate().to("https://the-internet.herokuapp.com/infinite_scroll");


			d.manage().window().maximize();
	JavascriptExecutor j= (JavascriptExecutor)d;
	//To scroll down to the end of the webPage
	j.executeScript("window.scrollBY(0,9000)");



	}

}
