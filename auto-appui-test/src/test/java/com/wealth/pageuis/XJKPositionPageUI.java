package com.wealth.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

public class XJKPositionPageUI extends BasePageUI {

    public static final CommonUIBean XJK_TITLE = new CommonUIBean(GetElementWay.XPATH,
            "//android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]",
            "小金库持仓");

    public static final CommonUIBean XJK_PayOut = new CommonUIBean(GetElementWay.XPATH,
            "//android.widget.TextView[@text='转出']",
            "小金库转出");

    public static final CommonUIBean XJK_PayIn = new CommonUIBean(GetElementWay.XPATH,
            "//android.widget.TextView[@text='转入']",
            "小金库转入");

}