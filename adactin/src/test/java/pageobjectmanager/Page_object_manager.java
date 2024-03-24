package pageobjectmanager;

import org.openqa.selenium.WebDriver;

import base.adactin.clas.Pom;

public class Page_object_manager {
	public static WebDriver driver;
	
	private Pom p;
	
	public Page_object_manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Pom getinstanceLoginpage(){
		p=new Pom(driver);
		return p;
	}
}
