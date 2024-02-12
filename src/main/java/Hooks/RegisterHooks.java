package Hooks;

import io.cucumber.java.*;
import utilities.Driver;

public class RegisterHooks {
    @BeforeAll
    public static void initTest() {
        System.out.println("************ Begin Test");
        Driver. getDriver();
    }

    @AfterAll
    public static void endTest() {
        System.out.println("************ End Test");
        Driver.getDriver().quit();
    }

    @Before
    public void beforeScenario(Scenario s) {

        System.out.println("Before Scenario: " + s.getName());
    }

    @After
    public void afterScenario(Scenario s) {

        System.out.println("After  Scenario:" + s.getName());
    }
}

