package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.utils.AppDriver;

public class WealthPage {

    By POSITION_BTN = By.xpath("//android.widget.TextView[@resource-id='com.jd.jrapp:id/tv_my_hold']");

    public MyHoldPage tapMyPosition(){
        AppDriver.driver.findElement(POSITION_BTN).click();
        return new MyHoldPage();
    }


}
