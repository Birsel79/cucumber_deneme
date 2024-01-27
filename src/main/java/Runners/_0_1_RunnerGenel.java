package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java"},
        glue = {"stepDefinitions"},
        dryRun = false
)

public class 01RunnerGenel extends AbstractTestNGCucumberTests {

}

