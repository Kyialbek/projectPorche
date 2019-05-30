package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {
	WebDriver over;
	@Before
	public void before () {
		WebDriverManager.chromedriver().setup();
		over = new ChromeDriver();
				over.manage().window().fullscreen();
				over.manage().deleteAllCookies();
				over.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	public void swithWindow(String titleOfPage) {
		Set<String> windows = over.getWindowHandles();
		
		for(String each:windows) {
			over.switchTo().window(each) ;
				
			if(over.getTitle().equals(titleOfPage)) {
				break;
			}
			
		}
	}
	@After
	public void afterMet() throws InterruptedException{
		Thread.sleep(5000);
		//over.close();
	}

}
