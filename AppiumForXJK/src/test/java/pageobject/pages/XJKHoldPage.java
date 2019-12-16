package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.utils.AppDriver;

public class XJKHoldPage {

    By XJK_PayIn = By.xpath("//android.widget.TextView[@text='转入']");

    By XJK_PayOut = By.xpath("//android.widget.TextView[@text='转出']");

    public XJKPayinPage xjkPayin() throws InterruptedException{
        AppDriver.driver.findElement(XJK_PayIn).click();
        Thread.sleep(3000);
        return new XJKPayinPage();
    }

    public XJKPayoutPage xjkPayOut() throws InterruptedException{
        AppDriver.driver.findElement(XJK_PayOut).click();
        Thread.sleep(3000);
        return new XJKPayoutPage();
    }
}
