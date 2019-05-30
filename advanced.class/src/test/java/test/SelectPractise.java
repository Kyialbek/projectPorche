package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectPractise extends testBase{
	@Test
	public void test() throws InterruptedException{
		over.get("https://www.spicejet.com/");
		WebElement box = over.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select = new Select(box);
		select.selectByVisibleText("USD");
		Thread.sleep(3000);
		select.selectByValue("AED");
		Thread.sleep(3000);
		select.selectByIndex(3);
		Thread.sleep(3000);
		
	}

}
