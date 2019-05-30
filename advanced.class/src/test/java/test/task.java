package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task {
	WebDriver over;
	@Before
	public void before () {
		WebDriverManager.chromedriver().setup();
		over = new ChromeDriver();
		// over.get("//http://the-internet.herokuapp.com/hovers");
		over.manage().window().maximize();
		
		
	}
	@Test
	   public void kran () throws InterruptedException {
        over.get("http://the-internet.herokuapp.com/hovers");
        Thread.sleep(2000);
        Actions action= new Actions(over);
        
        WebElement user1=over.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
        action.moveToElement(user1).build().perform();
        
        String u1=over.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5[.='name: user1']")).getText();
        System.out.println(u1);
        
        
        Thread.sleep(2000);
        
        WebElement user2=over.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));
        action.moveToElement(user2).build().perform();
        String u2=over.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/h5[.='name: user2']")).getText();
        System.out.println(u2);
    
        Thread.sleep(2000);
        
        WebElement user3=over.findElement(By.xpath("//*[@id='content']/div/div[3]/img"));
        action.moveToElement(user3).build().perform();
        String u3=over.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/h5[.='name: user3']")).getText();
        System.out.println(u3);
    
        Thread.sleep(2000);

}
	@After
	public void after() throws InterruptedException {
	
		Thread.sleep(4000);
		over.close();
	}
}
