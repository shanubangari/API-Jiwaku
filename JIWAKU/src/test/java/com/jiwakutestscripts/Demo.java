package com.jiwakutestscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		driver.close();
	}
	

}
