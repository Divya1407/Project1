package org.java.constructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vaishu\\eclipse-workspace\\SampleProject\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
	    WebElement e = driver.findElement(By.id("email"));
	    e.sendKeys("divyadevi@gmail.com");
	    WebElement p = driver.findElement(By.name("pass"));
	    p.sendKeys("ddddd");
	   WebElement btn = driver.findElement(By.id("loginbutton"));
	   btn.click();
	   
	    
	    
	    
	}
}
