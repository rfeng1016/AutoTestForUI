package com.wealth.pages;

import com.wealth.pageuis.FinancialHomePageUI;
import macaca.java.biz.BasePage;

public class FinancialHomePage extends BasePage{

    public FinancialHomePage(String pageDesc){
        super(pageDesc);
    }

    /**
     * 点击财富 tap
     */
    public void tapWealth() throws Exception{
//        driver.onclickBean(FinancialHomePageUI.WEALTH_TAB);
        driver.waitForElement(FinancialHomePageUI.WEALTH_TAB).click();

    }

    public void tapMyPosition() throws Exception{
//        driver.onclickBean(FinancialHomePageUI.WEALTH_TAB);
        driver.waitForElement(FinancialHomePageUI.POSITION_BTN).click();

    }
}

