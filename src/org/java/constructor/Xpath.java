package org.java.constructor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Xpath {
	public static void main(String[] args) throws AWTException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishu\\eclipse-workspace\\SampleProject\\Driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement a = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	a.sendKeys("green technologies");
	/*Actions act = new Actions(driver);
	act.moveToElement(a).perform();
	WebElement grn = driver.findElement(By.xpath("//span[text()='green technologies'][1]"));
	act.moveToElement(grn).perform();
	grn.click();
	WebElement b = driver.findElement(By.xpath("//input[@class='gNO89b'][1]"));
	b.click();*/
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);


	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	}
		

	}
	


