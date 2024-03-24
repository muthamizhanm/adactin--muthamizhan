package adactin.stepp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import adactin.runner.Runner1;
import adactinproject.pom.Baseclasss;
import base.adactin.clas.Pom;
import io.cucumber.java.en.*;
import pageobjectmanager.Page_object_manager;

public class Steppdef1 extends Baseclasss {
	
	public static WebDriver driver=Runner1.driver;
	
	
	Page_object_manager pom=new Page_object_manager(driver);
	
	@Given("User want launch the home page")
	public void user_want_launch_the_home_page() {
	    driver.get("https://adactinhotelapp.com/");
	}
	@When("User want to sendthe username")
	public void user_want_to_sendthe_username() {
		WebElement username = driver.findElement(By.id("username"));
	   username.sendKeys( "Suryapriya0401");
	}
	@When("Userwant to send the password")
	public void userwant_to_send_the_password() {
		WebElement username = driver.findElement(By.name("password"));
		   username.sendKeys( "Demo@2022");
	     
	}
	@When("User want to click the login button")
	public void user_want_to_click_the_login_button() {
		click(pom.getinstanceLoginpage().getLogin());
	}
	@When("User want to see the Booking page")
	public void user_want_to_see_the_booking_page() {
	 boolean status = driver.findElement(By.xpath("//img[@alt=\"AdactIn Group\"]")).isDisplayed();
	 if(status) {
		 System.out.println("Login page Result Sucessfull");
	 }
	}



}
