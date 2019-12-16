package com.wealth.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

public class FinancialHomePageUI extends BasePageUI {

    public static final CommonUIBean WEALTH_TAB = new CommonUIBean(GetElementWay.XPATH,
        "//android.widget.RelativeLayout[@resource-id='com.jd.jrapp:id/secondLayout']",
        "财富频道首页");

    public static final CommonUIBean POSITION_BTN = new CommonUIBean(GetElementWay.XPATH,
            "//*[@text='我的持仓']",
            "财富频道首页");
}
