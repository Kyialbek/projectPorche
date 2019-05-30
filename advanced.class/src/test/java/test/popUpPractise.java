package test;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class popUpPractise extends testBase {
	
	
	@Test
	public void tester() throws InterruptedException{
		over.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert alert = over.switchTo().alert();
		WebElement element = over.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		Thread.sleep(3000);
		element.click();
		Alert alert1 = over.switchTo().alert();
		alert1.accept();
		//Thread.sleep(3000);
		WebElement jcConfirm = over.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		jcConfirm.click();
		alert1.accept();
		Thread.sleep(3000);
		
		WebElement jsPrompt = over.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		jsPrompt.click();
		Thread.sleep(3000);
		alert1.sendKeys("KKK");
		alert1.accept();
		
	}
	@Test
	public void tess() throws InterruptedException {
		
		over.get("https://sweetalert.js.org/");
		Thread.sleep(3000);
		over.findElement(By.xpath("(//button[@class='preview'])[2]")).click();
		Thread.sleep(3000);
		over.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
		
	}

}
