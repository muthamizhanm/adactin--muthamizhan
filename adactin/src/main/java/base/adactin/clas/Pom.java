package base.adactin.clas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	
public static WebDriver driver;


	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement login;

	public Pom(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}

	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}



	public void sendKey(String value) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
