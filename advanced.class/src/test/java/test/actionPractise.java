package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionPractise {
	WebDriver driver;

	@Before

	public void before() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

	}

//	@Test
//	public void test() {
//		driver.get("http://the-internet.herokuapp.com/upload");
//		WebElement choose = driver.findElement(By.id("file-upload"));
//		String location = "C:\\Users\\User\\Desktop\\TechtorialLOGO.png";
//		choose.sendKeys(location);
//		WebElement upload = driver.findElement(By.id("file-submit"));
//		upload.click();
//		String text = driver.findElement(By.id("uploaded-files")).getText();
//		System.out.println(text);
//
//	}

//	@Test
//	public void test2() throws InterruptedException{
//		driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
//		
//		Actions action = new Actions(driver);
//		WebElement doubleClick = driver.findElement(By.id("puff_content"));
//		Thread.sleep(4000);
//		action.doubleClick(doubleClick).perform();
//	}
//	
//	@Test
//	public void test3() throws InterruptedException{
//		driver.get("https://www.amazon.com/");
//		
//		Actions action1 = new Actions(driver);
//		WebElement howerover = driver.findElement(By.id("nav-link-accountList"));
//		Thread.sleep(4000);
//		action1.moveToElement(howerover).perform();
//	}
//	@Test
//	public void test4() throws InterruptedException{
//		driver.get("https://www.amazon.com/");
//		Actions action = new Actions(driver);
//		
//		
//		
//		action.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(3000);
//		action.sendKeys(Keys.PAGE_UP).perform();
//		driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']")).click();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//	@Test
//	public void test5() throws InterruptedException{
//		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
//		Actions action = new Actions(driver);
//		//Actions action = new Actions(driver);
//        WebElement dragAndDropA = driver.findElement(By.xpath("/html//div[@id='draggable']"));
//        WebElement dragAndDropB = driver.findElement(By.xpath("//div[@id='droptarget']/div[@class='test1']"));
//        action.moveToElement(dragAndDropA).clickAndHold().moveToElement(dragAndDropB).release().build().perform();
//		
//	} 
	
//@After
	public void after() throws InterruptedException {

		Thread.sleep(4000);
		 driver.quit();
	}

}
