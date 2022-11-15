package com.Dress_Booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Page {
	public WebDriver driver;
@FindBy(xpath="//div[@class='left-block']//img[@title='Printed Chiffon Dress']")
private WebElement chiffon;

public Dresses_Page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);}

public WebElement getChiffon() {
	
	return chiffon;
}

}
