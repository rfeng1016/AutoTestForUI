package com.wealth.pages;

import com.wealth.pageuis.XJKPositionPageUI;
import macaca.java.biz.BasePage;

public class XJKPositionPage extends BasePage {

    public XJKPositionPage (String pageDesc){
        super(pageDesc);
    }

    /**
     * 小金库持仓
     */
    public void xjkTitle (){
        driver.onclickBean(XJKPositionPageUI.XJK_TITLE);
    }


    /**
     * 小金库转出
     */
    public void xjkPayOut () throws Exception{
        driver.waitForElement(XJKPositionPageUI.XJK_PayOut).click();
    }

    /**
     * 小金库转入
     */
    public void xjkPayin () throws Exception{
        driver.waitForElement(XJKPositionPageUI.XJK_PayIn).click();
    }
}
