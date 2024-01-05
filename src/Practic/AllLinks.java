package Practic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
	
WebDriver d= new ChromeDriver();
d.navigate().to("https://www.youtube.com/");


d.manage().window().maximize();

List<WebElement> allLinks = d.findElements(By.xpath("//a"));
int count = allLinks.size();
System.out.println("The total number of links present in Youtube  website are "+count);
/*for(WebElement  links: allLinks) {
	
	String text = links.getText();
	System.out.println(text);
	}*/
	
	for (int i=0; i<count; i++) {
		
		
		String allLinksText = allLinks.get(i).getText();	
		System.out.println(allLinksText);
}

	}

}
