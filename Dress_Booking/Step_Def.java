package com.Dress_Booking;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class Step_Def extends Base_Dress_Class {
	public static WebDriver driver=Runner_Dresses.driver;
	public static Page_object_Adactin_Manager manager=new Page_object_Adactin_Manager(driver);
	
	
	@Given("User able to open adactin application")
	public void user_able_to_open_adactin_application() {
		get("http://automationpractice.com/index.php");
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click on Dresses option")
	public void user_click_on_dresses_option() {
		click(manager.getMy_Store().getDresses());
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User able to go to Dresses-My Store")
	public void user_able_to_go_to_dresses_my_store() {
		
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User able to open dresses page")
	public void user_able_to_open_dresses_page() {
		implicit_Wait();
	    throw new io.cucumber.java.PendingException();
	}

	@When("User selecting Required dress")
	public void user_selecting_chiffon_dress() {
		scroll_To_Element(manager.getChiffon().getChiffon());
		click(manager.getChiffon().getChiffon());
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User able to navigate to next page")
	public void user_able_to_navigate_to_next_page() throws IOException {
		screenshot();
	    throw new io.cucumber.java.PendingException();
	}

}
