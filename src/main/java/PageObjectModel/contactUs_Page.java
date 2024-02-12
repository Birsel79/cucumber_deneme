package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.logging.XMLFormatter;

public class contactUs_Page extends AbstractClass {

    WebDriver driver;

    public contactUs_Page() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[1]/a")
    private WebElement contactUsButton;

    public void clickContactUsButton() {
        clickFunction(contactUsButton);
    }

    @FindBy(xpath = "//input[@id=\"input-name\"]")
    private WebElement nameTextArea;
    public void typeName() {
        sendKeysFunction(nameTextArea, "Birsel");
    }
    @FindBy(xpath = "//input[@id=\"input-email\"]")
    private WebElement emailTextArea;

    public void typeEmail() {
        sendKeysFunction(emailTextArea, "1234ab@gmail.com");

    }
    @FindBy(id = "input-enquiry")
    private WebElement typeMessageBox;
    public void typeMessage(){
        sendKeysFunction(typeMessageBox,"Tesekkurler");
}
    @FindBy (xpath = "//input[@type=\"submit\"]")
    private WebElement submitButton;
    public void clickSubmitButton(){
        clickFunction(submitButton);
    }
    @FindBy(xpath = "//a[@class=\"btn btn-primary\"]")
    private WebElement continueButton;
    public void clickContinueButton(){
        clickFunction(continueButton);
    }
   // @FindBy(css="...")
   // private WebElement successMessage;
   // public void assertMyMesage(){
       //Assertion(successMessage,".........");
   // }

}
