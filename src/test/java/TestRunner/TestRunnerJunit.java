package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

 
//@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = { "StepDefinitions","cucumberHooks"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json"
        },
        monochrome = true,
        dryRun = false
)

public class TestRunnerJunit extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}