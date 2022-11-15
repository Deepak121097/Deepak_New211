package com.Dress_Booking;

import org.openqa.selenium.WebDriver;

public class Page_object_Adactin_Manager {
	public WebDriver driver;

	public Page_object_Adactin_Manager(WebDriver driver2) {
    this.driver=driver2;
   }

	public My_Store_Adactin getMy_Store() {
		if (my_Store==null) {
			my_Store=new My_Store_Adactin(driver);
		}
		return my_Store;
	}

	private My_Store_Adactin my_Store;
	private Dresses_Page chiffon;

	public Dresses_Page getChiffon() {
		if (chiffon==null) {
			chiffon=new Dresses_Page(driver);
		}
		return chiffon;
	}
	
	
	
	
	
}
