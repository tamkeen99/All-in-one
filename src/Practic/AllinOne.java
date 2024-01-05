package Practic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AllinOne {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		d.get("https://testautomationpractice.blogspot.com/");
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.findElement(By.id("name")).sendKeys("Mark Zack");
		Thread.sleep(1000);
		d.findElement(By.id("email")).sendKeys("markzach77@gmail.com");
		Thread.sleep(1000);
		d.findElement(By.id("phone")).sendKeys("8747987654");
		Thread.sleep(1000);
		d.findElement(By.id("textarea")).sendKeys("Address. P.O. Box 1450. Alexandria, VA 22313-1450 ; Telephone, (1 571) 272 8600 (Under Secretary and Director)");
		Thread.sleep(1000);
		d.findElement(By.xpath("//label[@for='male']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@value='sunday']")).click();
		Thread.sleep(1000);
		WebElement select = d.findElement(By.xpath("//select[@id='country']"));
		  Select s= new Select(select);
		  s.selectByVisibleText("Germany");                                               
		 
		d.findElement(By.xpath("//option[@value='blue']")).click();
			Thread.sleep(1000);
		d.findElement(By.id("datepicker")).sendKeys("01/06/2023");
			Thread.sleep(1000);
			//d.findElement(By.xpath("(//a[@class='ui-state-default' and @aria-current='false' ])[3]")).click();
		d.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Tamkeen");
			Thread.sleep(1000);
		d.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
			Thread.sleep(1000);
		List<WebElement> autosug = d.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
			
			for (WebElement auto: autosug) {
				
				String text = auto.getText();
				System.out.println(text);
			}
			
			d.findElement(By.xpath("//a[text()='More »'] ")).click();
		Set<String> wikihandle = d.getWindowHandles();

		ArrayList<String>a2= new ArrayList<String>(wikihandle);
		d.switchTo().window(a2.get(1));
		 

		d.findElement(By.xpath("//input[@class='cdx-text-input__input']")).sendKeys("Wiki");
		 List<WebElement> wikiauto = d.findElements(By.xpath("//li[@role='option']"));
			for(WebElement wauto: wikiauto ) {
				
				String textwiki=wauto.getText();
				System.out.println(textwiki);
				
			}
			String pw = d.getWindowHandle();
                for(String pw1: a2) {
	            if(pw.equals(pw1)) {
		
	        }
	       else {
	       d.close();
	}
}
            //String pw4 = d.getWindowHandle();
			//d.switchTo().window(pw4);
			d.switchTo().window(a2.get(0));
			WebElement doub = d.findElement(By.xpath("//button[.='Copy Text']"));
			WebElement drag = d.findElement(By.id("draggable"));
			WebElement drop= d.findElement(By.id("droppable"));
			
			Actions a1=new Actions(d);
			
			
			a1.doubleClick(doub);
			Thread.sleep(2000);
			a1.dragAndDrop(drag, drop).perform();
			
			Thread.sleep(2000);
			WebElement slide = d.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
			Actions a=new Actions(d);
			
		a.dragAndDropBy(slide, 310, 0).perform();
		
		
		// we have to swith to frame first locate the webelement
		WebElement frm = d.findElement(By.id("frame-one796456169"));
		d.switchTo().frame(frm);
	  	d.findElement(By.xpath("//input[@id='RESULT_TextField-0']")).sendKeys("Tamkeen");
	 	d.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("01/08/2023");
		 WebElement s1 = d.findElement(By.xpath("//select[@id='RESULT_RadioButton-3']"));
	      Select s2= new Select(s1);
	
	s2.selectByIndex(2);
	//	WebElement ele = d.findElement(By.xpath("//input[@id='RESULT_RadioButton-1_0']"));
	//	JavascriptExecutor j=(JavascriptExecutor)d;
	//	j.executeScript("argument[0].click", ele);
				
	}

}
