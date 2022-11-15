package com.Dress_Booking;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import net.bytebuddy.asm.Advice.AllArguments;

public class Base_Dress_Class {
public static WebDriver driver;
public static  WebDriver browser_Launch(String name) {
if (name.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chrome exe file\\chromedriver.exe");
	 driver=new ChromeDriver();
	
}else if (name.equalsIgnoreCase("edge")) {
	System.setProperty("webdriver.edge.driver",
			 System.getProperty(("user.dir")+"\\edge folder\\msedgedriver.exe"));
	 driver=new EdgeDriver();
}
	driver.manage().window().maximize();
	return driver;
	
}
public static void get(String url) {
driver.get(url);
}
public static void navigate(String url) {
driver.navigate().to(url);
}
public static void refresh() {
driver.navigate().refresh();
}	
public static void screenshot() throws IOException {
TakesScreenshot ts=(TakesScreenshot)driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File destination=new File("\\Dress_Booking\\snaps");
FileUtils.copyFile(source, destination);
}	
public static void quit() {
driver.quit();
}
public static String currenturl() {
String currentUrl = driver.getCurrentUrl();
return currentUrl;
}	
public static void click(WebElement element) {
element.click();
}	
public static void sendkeys(WebElement element,String data) {
element.sendKeys(data);
}	
public static void scroll_To_Element(WebElement ele) {
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView()", ele);
}	
public static void implicit_Wait() {
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}	
	
	
	
	
	
	
	
	
}
