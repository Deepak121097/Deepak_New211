package com.Dress_Booking;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\deepa\\eclipse-workspace\\Dress_Booking\\adactin feature.feature\\Adactin 1.feature",glue="com.Step_def",plugin= {"json:target/eclipse-workspace/Dress_Booking/Report/report.json"})








public class Runner_Dresses {

	public static WebDriver driver;
	
	@BeforeClass
	public static void step_UP() {
		
		driver=Base_Dress_Class.browser_Launch("chrome");
		
		
	}
	
	@AfterClass
	public static void tear_Down() {
		
     Base_Dress_Class.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
