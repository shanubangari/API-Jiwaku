package com.jiwakutestscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.jiwakuGenericUtils.WebDriverUtility;

public class Arjun extends WebDriverUtility{
@Test
public void arjunTest() {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.skillrary.com/");
	WebElement gears = driver.findElement(By.xpath("//span[text()='GEARS']"));
Actions a=new Actions(driver);
a.moveToElement(gears).perform();
	//driver.findElement(By.xpath("//span[text()='GEARS']")).click();
	driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[1]")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	// WebElement sel = driver.findElement(By.xpath("//select[@class='chosen-select']"));
//Select s=new Select(sel);
//s.selectByIndex(1);
	
//driver.findElement(By.xpath("//option[@value='category.php?category=testing']")).click();
	driver.quit();
}
}
