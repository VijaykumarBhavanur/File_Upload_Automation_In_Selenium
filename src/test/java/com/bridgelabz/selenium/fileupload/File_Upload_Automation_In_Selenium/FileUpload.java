package com.bridgelabz.selenium.fileupload.File_Upload_Automation_In_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 
 * @author Vijaykumar Bhavanur 
 * purpose: To demonstrate file upload in selenium
 * 
 */
public class FileUpload {
	
	// Defining driver instance reference
	WebDriver driver;
	
	/**
	 * Method used to create and initialize driver instance
	 */
	@BeforeMethod
	public void setup()
	{
		// To set the path of the driver for the respective browser
		System.setProperty("webdriver.chrome.driver","/home/admin1/Documents/chromedriver");
		
		// Creating browser instance based on driver
		driver=new ChromeDriver();
		// To Open URL of application to be tested
		driver.get("https://tus.io/demo.html");
		
		//Maximizing window
		driver.manage().window().maximize();
	}
	
	

	/**
	 * Method to Test file upload
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void uploadTest() throws InterruptedException
	{
		//Finding webelement by xpath and sending path of file to be uploaded to it
		  driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@class='content']/div[@class='container']/p/input[1]"
		  )).sendKeys("/home/admin1/Desktop/browse.png");
		  
		  //waiting for 5seconds
		  Thread.sleep(5000); 
	}
	
	/**
	 * Method to close resource such as browser after executing test methods
	 */
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
