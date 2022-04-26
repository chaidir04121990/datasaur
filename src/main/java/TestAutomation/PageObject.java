package TestAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageObject extends Config{
    @FindBy(xpath = "//div[@class=\"sc-AxiKw eSbheu\"]/header[@class=\"sc-AxhCb eSwYtm\"]/a[text()=\"\uD83D\uDD25 Explore the API \uD83D\uDD25\"]")
    WebElement expAPI;

    @FindBy(xpath = "//div[@class=\"history-contents\"]/div/div/div[22]/div/span/input[@type=\"checkbox\"]")
    WebElement launchesPast;

    @FindBy(xpath = "//div[@class=\"history-contents\"]/div/div/div[6]/span/input[@type=\"checkbox\"]")
    WebElement company;

    @FindBy(xpath = "//div[@class=\"execute-button-wrap\"]/button")
    WebElement btnRun;

    @FindBy(xpath = "//div[@class=\"result-window\"]/div/div[@class=\"CodeMirror-scroll\"]/div/div/div/div/div[@class=\"CodeMirror-code\"]/pre[1]/span/span[5]")
    WebElement EM;

    @FindBy(xpath = "//table[@class=\"infobox vcard\"]/tbody/tr[7]/td/a[text()=\"Elon Musk\"]")
    WebElement EM_Wiki;

    public static PageObject Init_PageObject(){
        PageObject po = new PageObject();
        PageFactory.initElements(driver,po);
        return po;
    }

    public void clickExpAPI(){
        expAPI.isDisplayed();
        expAPI.click();
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }

    public void uncheckLaunchesPast(){
        launchesPast.isSelected();
        launchesPast.click();
    }

    public void checkCompany(){
        company.isDisplayed();
        company.click();
    }

    public void clickBTN(){
        btnRun.isDisplayed();
        btnRun.click();
    }

    public String getTextEM1(){
        String elon1 = EM.getText();
        return elon1;
    }

    public String getTextEM2(){
        String elon2 = EM_Wiki.getText();
        return  elon2;
    }

//    public void Assertion(){
//        Assert.assertEquals(getTextEM1(),getTextEM2());
//    }
}
