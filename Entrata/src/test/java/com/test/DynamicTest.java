package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class DynamicTest {
	 WebDriver driver;
	   

	    @BeforeClass
	    public void setUp() {
	         
	    	// open ChromeDriver
	        driver = new ChromeDriver();
	        
	        //implisit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        //Maximize window
	        driver.manage().window().maximize();
	       
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }

	    @Test
	    public void testDynamicContent() {
	    	
	    	/*
	    	driver.get("https://www.entrata.com/");
	        
	    	  //Accept all cookies
	        driver.findElement(By.id("rcc-confirm-button")).click();
	       
	        driver.findElement(By.xpath("//div[@class='hero-right']//img[@alt='Product metrics graphic']")).click();
	       */
	    	
	    	try {
	            // Navigate to the Entrata website
	            driver.get("https://www.entrata.com/");
	            
	            driver.findElement(By.id("rcc-confirm-button")).click();
	            
	            // Wait for the product metrics image to be clickable
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	            WebElement productMetricsImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='mobile-layout-nov2023']//img[@alt='Product metrics graphic']")));
	            
	         
	            // Click on the product metrics image
	            productMetricsImage.click();
	            
	            // Wait for the product details element to appear
	            WebElement productDetailsElement = driver.findElement(By.className("Product metrics graphic"));
	            
	            // Assert that the product details element is displayed
	            Assert.assertTrue(productDetailsElement.isDisplayed(), "Product details element is not displayed");
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	            
	        } finally {
	        	
	            // Close the browser
	            driver.quit();
	            
	            System.out.println("Product metrics graphic");
	        }
	    }
}
