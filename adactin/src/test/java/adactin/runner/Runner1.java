package adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import adactinproject.pom.Baseclasss;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature",glue="adactin\\stepp")
public class Runner1 {
public static WebDriver driver;

    @BeforeClass
	public static void set_up() {
		
		driver=adactinproject.pom.Baseclasss.getBrowser("chrome");
		
		
	}
	
	
}
