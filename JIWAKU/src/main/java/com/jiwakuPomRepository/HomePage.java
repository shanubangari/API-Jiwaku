package com.jiwakuPomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement ContactsLnk;
	
	public WebElement getContactsLnk() {
		return ContactsLnk;
	}
	
	
	
	

}
