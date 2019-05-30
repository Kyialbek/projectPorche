package test;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowPractise extends testBase {
	
	@Test
	
	public void test() {
		
		over.get("http://the-internet.herokuapp.com/windows");
		//This method will return the ID for the page
		String defaultWindow =over.getWindowHandle();
		//System.out.println(defaultWindow);
		
		//getWindowHandles() will return all tabs which are opened
		WebElement clickButton = over.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
		clickButton.click();
		
		
		Set<String> window = over.getWindowHandles();
		
		for(String each: window) {
			if(!each.equals(defaultWindow)) {
				over.switchTo().window(each);
			
			System.out.println(each);
		}}
		
	}
	

}
