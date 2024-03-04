package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormValidation {
	
	  WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	      
	    	//open ChromeDriver
	        driver = new ChromeDriver();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	           // Implicit Wait used for 30 seconds
	        
	        //to maximize page
	           driver.manage().window().maximize();
	    }

	    @AfterClass
	    public void close2() {
	        driver.quit();
	    }

	    @Test
	    public void testContactForm() {
	    	
	    	//Open entrata web site
	        driver.get("https://www.entrata.com/");
	        
	        //Accept all cookies
	        driver.findElement(By.id("rcc-confirm-button")).click();
	        
	        //click on sign on button
	        driver.findElement(By.xpath("//a[@class='button-default outline-dark-button']")).click();
	        
	        //click on resident login
	        driver.findElement(By.xpath("//a[@title='Resident Portal Login Button']")).click();
	        
	        //Click on view the web site
	        driver.findElement(By.xpath("//div[@class='start-button website-button']")).click();
	        
	        //click on contact us button
	        driver.findElement(By.xpath("//div[@class='landing-nav four-content']//a[@href='#app-contact'][normalize-space()='Contact Us']")).click();
	        
	        //fill details(name,email, property name)
	        
	        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abhis");
	        
	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhis@gmail.com");
	        
	        driver.findElement(By.xpath("//input[@id='property_name']")).sendKeys("Ab");
	        

	        driver.findElement(By.xpath("//input[@id='property_url']")).sendKeys("www.nobroker.com");
	        
	      WebElement drop2=driver.findElement(By.xpath("//select[@id='category']"));
	        
	        Select s2= new Select(drop2);
	          s2.selectByIndex(2);
	          
	        driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Hi this is demo testing");
	        
	        
	        /*
	           // we are not processing with submit button due to automation this submit many request  
	         
	           driver.findElement(By.xpath("//button[@id='contact-submit']")).click();
	           
	        */
	       
	        // check input values using Assert method and print result
	        
	        String actualValue = driver.findElement(By.id("name")).getAttribute("value");
	        String expectedValue = "abhis";
	        boolean isValueEqual = actualValue.equals(expectedValue);

	        // Print the actual and expected values
	        System.out.println("Actual Value: " + actualValue);
	        System.out.println("Expected Value: " + expectedValue);

	        // Print the result of the assertion
	        if (isValueEqual) {
	            System.out.println("Assertion Passed: Actual value is equal to expected value");
	        } else {
	            System.out.println("Assertion Failed: Actual value is not equal to expected value");
	        }

	        // Assert the result
	        Assert.assertTrue(isValueEqual);
	        
	        //navigate browser back
	     driver.navigate().back();
	    
	    
	    }
}
