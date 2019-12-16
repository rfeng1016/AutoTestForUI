package com.wealth.pages;

import com.wealth.pageuis.FinancialPositionPageUI;
import macaca.client.commands.Element;
import macaca.java.biz.BasePage;

public class FinancialPositionPage extends BasePage {

    public FinancialPositionPage(String pageDesc){
        super(pageDesc);
    }

    /**
     * 点击我的持仓
     */
    public void tapMyhold() throws Exception{
//        driver.onclickBean(FinancialPositionPageUI.MY_HOLD);
        driver.waitForElement(FinancialPositionPageUI.MY_HOLD).click();


    }
}
