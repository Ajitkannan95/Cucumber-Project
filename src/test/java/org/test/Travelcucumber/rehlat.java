package org.test.Travelcucumber;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.Window;
import java.awt.Window.Type;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.apache.http.impl.conn.tsccm.WaitingThreadAborter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.DisplayAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rehlat extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		lunchURL("https://www.rehlat.com/");
		windowmax();
		impwait(15);
		WebElement log = driver.findElement(By.xpath("//span[@class='ros_Header_login_txt gstref']"));
		log.click();
		WebElement logbtn = driver.findElement(By.xpath("//a[@class='signUpbutton'][1]"));
		logbtn.click();

		WebElement logid = driver
				.findElement(By.xpath("//input[@class='pl-4 ng-untouched ng-pristine ng-invalid'][1]"));

		logid.sendKeys("starajit005@gmail.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@class='pl-4 ng-untouched ng-pristine ng-invalid'][1]"));
		pwd.sendKeys("Jamkan@005");

		WebElement loginbtn = driver.findElement(By.className("stdButton"));

		loginbtn.click();
//		
//		WebElement trip = driver.findElement(By.xpath("//div[@class='mat-radio-inner-circle\'][1]"));
//System.out.println(trip.isSelected());
//	WebElement trip = driver.findElement(By.xpath("//div[@class='mat-radio-container'][1]"));
//trip.click();
//
//WebElement trip = driver.findElement(By.xpath("//div[@class='mat-radio-inner-circle'][3]"));
//
//radio-home mat-radio-button pl-1 mat-accent ng-star-inserted mat-radio-checked
//System.out.println(trip.isSelected());
		
WebElement t = driver.findElement(By.id("mat-radio-4"));

//
Actions action = new Actions(driver);
action.moveToElement(t).click().perform();

List<WebElement> f = driver.findElements(By.tagName("frame"));
System.out.println("Total number " + f.size());
}
	

}
