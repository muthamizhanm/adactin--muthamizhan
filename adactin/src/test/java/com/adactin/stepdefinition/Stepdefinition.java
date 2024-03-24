package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Stepdefinition {
	WebDriver driver;
	

	@Given("user want to launch the amazon home page")
	public void user_want_to_launch_the_amazon_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepan\\eclipse-workspace\\adactin\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@When("user want type the\"HP laptop\"")
	public void user_want_type_the_hp_laptop() {
	   WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	   searchbox.sendKeys("HP laptop");
	}
	@When("user want to click the search button")
	public void user_want_to_click_the_search_button() {
		WebElement searchbutton  = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
	    
	}
	@Then("user want to see the result")
	public void user_want_to_see_the_result() {
	    boolean status = driver.findElement(By.partialLinkText("HP")).isDisplayed();
	    if(status) {
	    	System.out.println("Result displayed");
	    }
	}




}
