package adactin.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Deepan\\eclipse-workspace\\adactin\\src\\test\\java\\com\\adactin\\feature",glue="com.log.automation.framework.stepdefinee",
		monochrome=true,dryRun=true)
public class Runner2023 {

}
