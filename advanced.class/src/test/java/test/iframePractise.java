package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iframePractise extends testBase{
//	
//	@Test
//	public void test() throws InterruptedException {
//		over.get("http://the-internet.herokuapp.com/iframe");
//		WebElement element =over.findElement(By.tagName("iframe"));
//		over.switchTo().frame(element);
//		WebElement element1 = over.findElement(By.id("tinymce"));
//		element1.sendKeys("Hi");
//		
//		
//		over.switchTo().defaultContent();
//		
//		WebElement text = over.findElement(By.xpath("//div//h3"));
//		System.out.println(text.getText());
//		Thread.sleep(3000);
	//}
//	@Test
//	
//	public void test1() {
//		
//		over.get("https://www.toolsqa.com/iframe-practice-page/");
//		over.switchTo().frame(1);
//		
//		WebElement draggable = over.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[5]/a"));
//		//draggable.click();
//		System.out.println(draggable.getText());
//	}
	
@Test
	
	public void test12() {
    over.get("https://www.toolsqa.com/iframe-practice-page/");
        
        //this one will switch the frame with Iframe name
        over.switchTo().frame("iframe1");
            
        WebElement automationText=over.findElement(By.xpath("(//span[@style='color: #3366ff;'])[1]"));
        
        System.out.println(automationText.getText());
	}

}
