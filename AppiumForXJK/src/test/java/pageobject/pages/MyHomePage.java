package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.utils.AppDriver;

public class MyHomePage {

    By WEALTH_TAB = By.xpath("//android.widget.ImageView[@resource-id='com.jd.jrapp:id/iv_second_icon']");

    public WealthPage tapWealth() {
        AppDriver.driver.findElement(WEALTH_TAB).click();
        return new WealthPage();
    }
}
