package org.hot;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Web {
	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Duraimurugan");
	driver.findElement(By.id("password")).sendKeys("Duraimurugan");
	driver.findElement(By.id("login")).click();		
		WebElement findElement = driver.findElement(By.id("adult_room"));
		findElement.click();
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		WebElement findElement1 = driver.findElement(By.id("location"));
		findElement1.click();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		WebElement findElement2 = driver.findElement(By.id("hotels"));
		findElement2.click();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		WebElement findElement3 = driver.findElement(By.id("room_type"));
		findElement3.click();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		WebElement findElement4 = driver.findElement(By.id("room_nos"));
		findElement4.click();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		WebElement findElement5 = driver.findElement(By.id("child_room"));
		findElement5.click();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		WebElement findElement6 = driver.findElement(By.id("Submit"));
		findElement6.click();
		
		WebElement findElement7 = driver.findElement(By.id("radiobutton_0"));
		findElement7.click();
		WebElement findElement8 = driver.findElement(By.id("continue"));
		findElement8.click();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;	
		WebElement findElement9 = driver.findElement(By.xpath("(//td[@align='right'])[10]"));
		js.executeScript("arguments[0].scrollIntoView(true)", findElement9);
		
		WebElement findElement10 = driver.findElement(By.xpath("//input[@id='first_name']"));
		findElement10.sendKeys("Sriram");
		WebElement findElement11 = driver.findElement(By.xpath("//input[@id='last_name']"));
		findElement11.sendKeys("Kumar");
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("GT,Vadapalanivgm,Bangalour-641523");
		WebElement cardnum = driver.findElement(By.xpath("//input[@id='cc_num']"));
		cardnum.sendKeys("1234567899874560");
		WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		cardtype.click();
		Robot b=new Robot();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		WebElement expmonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		expmonth.click();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		WebElement expyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		expyear.click();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("546");
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		Thread.sleep(8000);
		JavascriptExecutor js1 =(JavascriptExecutor) driver;	
		WebElement findElement21 = driver.findElement(By.xpath("//td[contains(text(),'Order No.')]"));
		js1.executeScript("arguments[0].scrollIntoView(true)",findElement21);

}
}
