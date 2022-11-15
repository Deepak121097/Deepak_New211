package com.Dress_Booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Store_Adactin {
public WebDriver driver;

public My_Store_Adactin(WebDriver driver2) {
	this.driver=driver2;
PageFactory.initElements(driver, this);
}

public WebElement getContactus() {
	return contactus;
}

public WebElement getWomen() {
	return women;
}

public WebElement getDresses() {
	return dresses;
}

@FindBy(xpath="//a[text()='Contact us']")
private WebElement contactus;

@FindBy(xpath="//a[text()='Women']")
private WebElement women;

@FindBy(xpath="//a[@title='Dresses']//following::a[@title='Dresses']")
private WebElement dresses;



	
	
	
	
	
	
}
