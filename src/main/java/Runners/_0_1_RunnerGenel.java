package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java"},
        glue = {"stepDefinitions"},
        dryRun = false

)

public class _0_1_RunnerGenel extends AbstractTestNGCucumberTests {

}

