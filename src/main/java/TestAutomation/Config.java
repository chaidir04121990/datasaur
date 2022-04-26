package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class Config {
    public static WebDriver driver;

    @AfterMethod
    public void teardown(){
        driver.close();
        driver.quit();
        System.out.println("==========Browser is closed==========");
    }
}
