package adactinproject.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.adactin.clas.Pom;

public class Baseclasss {
	public static WebDriver driver;
	public static WebDriver getBrowser(String browsername) {
	try {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+("\\driver\\Chromedriver.exe"));
			driver=new ChromeDriver();	
			
		}
		else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
			System.getProperty("user.dir")+("\\driver\\Chromedriver.exe"));
			driver=new EdgeDriver();
}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		driver.manage().window().maximize();
	return driver;
}
public static void getUrl(String value){
	try {
		driver.get(value);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void sendKey(Pom element,String value) {
	try {
		element.sendKey(value);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void click(WebElement element) {
		element.click();
	}
	
	public static void currentUrl (WebElement element ){
		try {
			driver.getCurrentUrl();
System.out.println(element.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void remove(WebElement element ){
	     
	}
	
	public static void forward() {
		
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void backward() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void refresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void navigateTo(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void quite() {
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getTitle() {
		try {
			driver.getTitle();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void enable(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void displayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void screenShot() {
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Deepan\\eclipse-workspace\\projectbrowser\\screenshot//test.png");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void mouser(WebElement element) {
		try {
			Actions ac=new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void mouser3(WebElement element,WebElement element2) {
		try {
			Actions ac=new Actions(driver);
			ac.dragAndDrop(element, element2).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void mouser2() {
		Actions ac=new Actions(driver);
		ac.contextClick().perform();
	}
	public static void ro_class(WebElement element) throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void S_conCept(WebElement element,String value) {
		Select sc=new Select(element);
		sc.selectByValue(value);
		sc.selectByVisibleText(value);
		
	}
	public static void fra_Concept(WebElement element,String value) {
		driver.switchTo().frame(value);
	}
	public static void scroll(WebElement element,String value) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public static void scroll2(WebElement element,String value) {
		driver.switchTo().frame(value);
	}
	
	public static void scroll2(String value,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
}
