package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Steps {
    @Given("Go to Amazon website")
    public void go_to_amazon_website() {
        System.out.println("went to Amazon website ");
    }
    @And("click login button")
    public void click_login_button() {
        System.out.println("clicked to login button");
    }
    @And("type your name")
    public void put_your_name() {
        System.out.println("put your name");
    }
    @And("type your password")
    public void put_your_password() {
        System.out.println("put your password");
    }
    @When("click to submit button")
    public void click_To_submit_Button() {
        System.out.println("clicked submit button ");
    }
    @Then("verify success messages")
    public void verify_success_messages() {
        System.out.println("verified success messages");
    }
}

