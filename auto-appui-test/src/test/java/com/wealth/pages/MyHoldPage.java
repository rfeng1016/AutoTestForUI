package com.wealth.pages;

import com.wealth.pageuis.XJKPositionPageUI;
import macaca.java.biz.BasePage;

public class MyHoldPage extends BasePage {

    public MyHoldPage(String pageDesc){
        super(pageDesc);
    }

    /**
     * 小金库持仓
     */
    public void xjkTitle (){
        driver.onclickBean(XJKPositionPageUI.XJK_TITLE);
    }

}
