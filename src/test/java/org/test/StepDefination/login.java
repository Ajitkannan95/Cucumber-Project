package org.test.StepDefination;

import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.test.Travelcucumber.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends BaseClass {


@Given("the User Should be Login Pagelocation")
public void the_User_Should_be_Login_Pagelocation() {

	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	 driver = new ChromeDriver(options);
lunchURL("https://www.rehlat.com/");
windowmax();
impwait(15);
	
   }

@When("the user has to fill {string} and {string} details")
public void the_user_has_to_fill_and_details(String user, String pass) {
//	List<String> li=data.asList();
//	
//	
//	String user = li.get(0);
//	System.out.println(user);
//	String pass1 = li.get(1);
//	System.out.println(pass1);

	
	WebElement log = driver.findElement(By.xpath("//span[@class='ros_Header_login_txt gstref']"));
	log.click();
WebElement logbtn = driver.findElement(By.xpath("//a[@class='signUpbutton'][1]"));
logbtn.click();
		
		WebElement logid = driver.findElement(By.xpath("//input[@class='pl-4 ng-untouched ng-pristine ng-invalid'][1]"));
	
	logid.sendKeys(user);
	WebElement pwd = driver.findElement(By.xpath("//input[@class='pl-4 ng-untouched ng-pristine ng-invalid'][1]"));
	pwd.sendKeys(pass);
	
   }

@When("the has to click login button")
public void the_has_to_click_login_button() {
WebElement loginbtn = driver.findElement(By.className("stdButton"));
	
	loginbtn.click();
	
   }

@Then("finally quit the login page")
public void finally_quit_the_login_page() {
	assertTrue("Verifying URL", getcurrentUrl().contains("rehlat"));
	//driver.quit();
	
	
  }



}
