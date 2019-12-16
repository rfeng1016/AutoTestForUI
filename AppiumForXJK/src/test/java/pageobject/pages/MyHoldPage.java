package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.utils.AppDriver;

public class MyHoldPage {

    By XJK_TITLE = By.xpath("//android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]");

    public XJKHoldPage xjkTitle(){
        AppDriver.driver.findElement(XJK_TITLE).click();
        return new XJKHoldPage();
    }
}
