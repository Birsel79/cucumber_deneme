package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    static ChromeOptions options = new ChromeOptions();
    private static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver==null){
            driver= new ChromeDriver();
            options.addArguments("--headless");
            //System.setProperty("webdriver.chrome.driver","C:\\Users...")
            driver= new ChromeDriver(options);
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
