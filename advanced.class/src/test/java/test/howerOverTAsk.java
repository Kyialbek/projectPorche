package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class howerOverTAsk extends testBase{
	@Test
	public void kia() throws InterruptedException {
		 over.get("http://the-internet.herokuapp.com/hovers");
		 Thread.sleep(3000);
		 Actions action = new Actions(over);
		 
		 WebElement user1 = over.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"));
		 Thread.sleep(3000);
		 action.moveToElement(user1).build().perform();
		 String text1 = over.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5")).getText();
		 
		 WebElement user2 = over.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[2]"));
		 Thread.sleep(3000);
		 action.moveToElement(user2).build().perform();
		 String text2 = over.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/h5")).getText();
		 
		 WebElement user3 = over.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[3]"));
		 Thread.sleep(3000);
		 action.moveToElement(user3).build().perform();
		 String text3 = over.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/h5")).getText();
		 
		 System.out.println(text1);
		 System.out.println(text2);
		 System.out.println(text3);
		 
		 
		 
		 
	}

}
