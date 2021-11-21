package com.jiwakuPomRepository;

import org.apache.poi.hssf.record.pivottable.PageItemRecord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement untbx;
	
	
	@FindBy(name = "user_password")
	private WebElement pwtbx;
	
	@FindBy(id = "submitButton")
	private WebElement lgbtn;

	
	
	public WebElement getUntbx() {
		return untbx;
	}



	public WebElement getPwtbx() {
		return pwtbx;
	}



	public WebElement getLgbtn() {
		return lgbtn;
	}



	public void loginToApp(String username, String password) {
		untbx.sendKeys(username);
		pwtbx.sendKeys(password);
		lgbtn.click();
	}
	
}
