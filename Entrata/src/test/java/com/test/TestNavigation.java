package com.test;

	import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;

	    @Test(priority=0)
		public class TestNavigation {
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
	        public void clode1() {
	          driver.quit();
	        }

	        public void testHomePage() {
	        	
	            driver.get("https://www.entrata.com/");
	            // using get method we open entrata.com web site 
	            
	            driver.findElement(By.id("rcc-confirm-button")).click();
	            // accept all cookies
	            
	            driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[1]")).click();
	            
	            driver.findElement(By.id("FirstName")).sendKeys("Abhhhi");
	            
	            driver.findElement(By.id("LastName")).sendKeys("xhyhz");
	            
	            driver.findElement(By.id("Email")).sendKeys("xhyg3@gmail.com");
	            
	            driver.findElement(By.id("Company")).sendKeys("Tesuting");
	            
	            driver.findElement(By.id("Phone")).sendKeys("902196900");
	            
	            // Handle dropdown using select class
	          WebElement drop =driver.findElement(By.id("Unit_Count__c"));
	         
	          Select s= new Select(drop);
	          s.selectByIndex(2);
	          
	          driver.findElement(By.id("Title")).sendKeys("Sodrgry");
	          
	          //Dropdown handled using select class
	          WebElement drop1 =driver.findElement(By.id("demoRequest"));
		         
	          Select demo= new Select(drop1);
	          demo.selectByIndex(1);
	          
	          
	        /*
	         // Submit Demo Form=> we didn't use because of  Avoiding Form Submissions
	          
	         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement button1 = driver.findElement(By.cssSelector("button[type='submit']"));

	       wait.until(ExpectedConditions.elementToBeClickable(button1));

	         button1.click();
	  
	         // Play Demo Video
	        driver.findElement(By.xpath("//button[@type='button']")).click();
	        */
	          System.out.println("Submit Demo Form=> we didn't use because of  Avoiding Form Submissions");
			}
	    }

	

