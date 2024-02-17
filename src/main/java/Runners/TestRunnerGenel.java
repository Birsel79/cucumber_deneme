package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java"},
        glue = {"stepDefinitions"},
        dryRun = false

)

public class TestRunnerGenel extends AbstractTestNGCucumberTests {

}

