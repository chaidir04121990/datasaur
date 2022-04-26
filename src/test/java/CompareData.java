import TestAutomation.Config;
import TestAutomation.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class CompareData extends Config {

//    public static WebDriver driver;
    private String baseURL1 = "https://spacex.land/";
    private String baseURL2 = "https://id.wikipedia.org/wiki/SpaceX";
    private String getelon1;
    private String getelon2;

    @Test
    public void getDataURL1(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(baseURL1);

        PageObject.Init_PageObject().clickExpAPI();
        PageObject.Init_PageObject().uncheckLaunchesPast();
        PageObject.Init_PageObject().checkCompany();
        PageObject.Init_PageObject().clickBTN();
        PageObject.Init_PageObject().getTextEM1();
        this.getelon1 = PageObject.Init_PageObject().getTextEM1();
        System.out.println("elon 1= "+getelon1);
    }

    @Test
    public void getDataURL2(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(baseURL2);

        PageObject.Init_PageObject().getTextEM2();
        getelon2 = PageObject.Init_PageObject().getTextEM2();
        this.getelon2 = '"'+getelon2+'"';
        System.out.println("elon 2= "+getelon2);

        Assert.assertEquals(getelon1,getelon2);
    }

}
