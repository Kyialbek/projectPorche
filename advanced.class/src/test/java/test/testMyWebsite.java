package test;

import java.awt.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class testMyWebsite {
	   WebDriver driver;
	    
	    @Before
	    public void beforeMethod() {
	        WebDriverManager.chromedriver().setup();
	        driver=new ChromeDriver();
	        driver.get("file:///C://Users//User//Desktop//mysite.html");
	    }
	    
	    @Test
	    public void test1() throws InterruptedException {
	        System.out.println("2");
	        Thread.sleep(3000);
	        String welcomeText=driver.findElement(By.id("WelcomeText")).getText();
	        System.out.println(welcomeText);
	        String expectedText="Welcome to My WebSite";
	       // Assert.assertEquals(expectedText, welcomeText);
	       // Assert.assertFalse(!welcomeText.equals(expectedText));
	        //Assert.assertFalse(!welcomeText.equals(expectedText));
	       // List <WebElement> tableRows = driver.findElement(By.xpath("//*/tr"));
	        
	        
	    }
	    
	    @Test
	    public void test2() {
	       
	    }
	    

	    @After
	    public void afterMethod() {
	        System.out.println("3");
	       // driver.close();
	    //    driver.quit();
	    }

	}

//driver.get("file:///C://Users//User//Desktop//mysite.html");
