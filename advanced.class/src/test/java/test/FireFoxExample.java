package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FireFoxExample extends actionPractise{
	//WebDriver driver;
	
	@Test
	public void tes() {
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
	
	Actions action = new Actions (driver);
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droptarget"));
	
	action.dragAndDrop(source, target).perform();
	
	
	
	
	}

}
