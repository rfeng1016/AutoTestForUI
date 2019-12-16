package pageobject.pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import pageobject.utils.AppDriver;


public class XJKPayinPage {

    By keyboard = By.id("keyboard");
    By confirm = By.xpath("//*[@id=\"confirmBtn\"]");

    public XJKPayinPage payintoxjk() throws InterruptedException{
        AppDriver.driver.context("WEBVIEW_com.jd.jrapp");
        AppDriver.driver.findElement(keyboard).click();
        Thread.sleep(2000);
        new TouchAction(AppDriver.driver).tap(PointOption.point(169,1600)).perform();
        Thread.sleep(1000);
        AppDriver.driver.findElement(confirm).click();
        return this;
    }
}
