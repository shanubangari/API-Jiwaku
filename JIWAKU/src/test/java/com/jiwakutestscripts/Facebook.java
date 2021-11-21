package com.jiwakutestscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	@Test

	public void facebook() throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("6363281558");
		driver.findElement(By.id("pass")).sendKeys("mysoul19@");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes, Continue')]")).click();
		//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_TAB);
		//r.keyRelease(KeyEvent.VK_TAB);
		//r.keyPress(KeyEvent.VK_ENTER);
		
		//driver.close();
		
			}
}
