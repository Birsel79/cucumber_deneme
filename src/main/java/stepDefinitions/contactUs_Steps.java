package stepDefinitions;

import PageObjectModel.contactUs_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class contactUs_Steps {
    private WebDriver driver;
    contactUs_Page contactUsPage = new contactUs_Page();

    @Given("navigate to Website")
    public void navigate_to_website() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("click on contact us button")
    public void click_on_contact_us_button() {

        contactUsPage.clickContactUsButton();
    }

    @And("type Name")
    public void name() {
        contactUsPage.typeEmail();
    }

    @And("type Email")
    public void type_email() {

        contactUsPage.typeName();
    }

    @And("type Message")
    public void typeMessage() {

        contactUsPage.typeMessage();
    }


    @When("click on submit button")
    public void click_on_submit_button() {
        contactUsPage.clickSubmitButton();
    }

    @Then("continue home page")
    public void continueHomePage() {
        contactUsPage.clickContinueButton();
    }
}