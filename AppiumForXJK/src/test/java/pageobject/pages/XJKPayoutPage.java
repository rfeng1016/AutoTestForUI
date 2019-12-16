package pageobject.pages;

import pageobject.utils.AppDriver;

public class XJKPayoutPage {

    public XJKHoldPage backtoxjk(){
        AppDriver.driver.navigate().back();
        return new XJKHoldPage();
    }


}
