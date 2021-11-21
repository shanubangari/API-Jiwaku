package com.jiwakutestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.jiwakuGenericUtils.WebDriverUtility;
import com.jiwakuPomRepository.HomePage;
import com.jiwakuPomRepository.LoginPage;


public class CreateQuoteunderMoreInformationwithoutMandatoryFields {
public WebDriver driver;
public WebDriverUtility wlib=new WebDriverUtility();

	@Test
	public void createQuoteunderMoreInformationwithoutMandatoryFieldsTest() {
		driver=new ChromeDriver();
		wlib.waitUntilPageLoad(driver);
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		LoginPage lgpg=new LoginPage(driver);
		lgpg.loginToApp("admin","admin");
		
		HomePage hm=new HomePage(driver);
		hm.getContactsLnk().click();
		
		//lOGOUT
		WebElement adstr = driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px' and @src='themes/softed/images/user.PNG']"));
		Actions a=new Actions(driver);
		a.moveToElement(adstr).perform();
		driver.findElement(By.linkText("Sign Out")).click();
	
	}
	
	
}
