package org.com;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProjects {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dharani\\eclipse-workspace\\Sele Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title); 
		driver.navigate().refresh();
	  WebElement username = driver.findElement(By.xpath("//button[text()='✕']"));
	  username.click();
	  //JavascriptExecutor js = (JavascriptExecutor)driver;
	  WebElement searchbox = driver.findElement(By.xpath("//input[@type='text']" ));
	 // js.executeScript("arguments[0].getAttribute('value','yonex badmition')",searchbox);
	  //Thread.sleep(1000);
	//  js.executeScript("arguments[0].click()", "searchbox");
	  searchbox.sendKeys("yonex badmition" );
	  Thread.sleep(20000);
    driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys(Keys.ENTER);
		WebElement fp = driver.findElement(By.xpath("//input[@type='text']"));
		String fpt = fp .getText();
		System.out.println(fpt);
		String attribute = fp.getAttribute("class");
		System.out.println(attribute); 
		 Thread.sleep(30000);
//		 Robot r =new Robot();
		
	
	    //yonexbat.click(); 
	  String parenturl = driver.getWindowHandle();
	  Set<String> childurl = driver.getWindowHandles();
	  for (String urls : childurl) {
		  if (!urls.equals(parenturl)) {
			  driver.switchTo().window(urls);
			  
			  
			
		}
		  
		
	}
	  driver.findElement(By.xpath("//a[@target='_blank']")).sendKeys(Keys.ENTER);
	 driver.switchTo().window(parenturl);
		WebElement gettext = driver.findElement(By.xpath("(//span[contains(text(),'Become a Seller')]) [1]"));
		String text = gettext.getText();
		if (text.equals("Become a Seller")) {
			System.out.println(text+"pass");
			
		}else {
			System.out.println(text+"fail");	
		}
	 	
		
		  
		
		

	}

}
