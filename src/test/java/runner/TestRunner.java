package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		
		features = "classpath.Features", // features tell cucumber options where features files are located 
		glue = {"stepDefinitions"}, // glue tells cucumber where all step Definitions are located 
		tags = {"@smoke"}, // tags tells cucumber options which scenario, scenario outline, or feature to run 
		dryRun = false, // if DryRun set to false, it will scan all the steps in scenario and scenario outline to find associated step
		                // in step Definition class. if any steps are missing it will print out them in console 
		monochrome = true, // makes the console output readable 
		strict = false, // // if set to false will fail the execution if there are pending steps 
		format = {"pretty",
	        "html:target/cucumber-reports/cucumber-pretty",
	        "json:target/cucumber-reports/CucumberTestReport.json",
	        "rerun:target/cucumber-reports/rerun.txt"
	},
	plugin = "json:target/cucumber-reports/CucumberTestReport.json")
		
		
	
public class TestRunner {

	// add cucumber options 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
