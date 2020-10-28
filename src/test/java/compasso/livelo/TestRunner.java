package compasso.livelo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
        glue = {"compasso.livelo.stepdefs"},
        plugin = "pretty"
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	
}
