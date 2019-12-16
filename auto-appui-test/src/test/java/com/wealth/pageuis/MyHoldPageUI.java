package com.wealth.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

public class MyHoldPageUI extends BasePageUI {

    public static final CommonUIBean XJK_TITLE = new CommonUIBean(GetElementWay.XPATH,
            "////android.widget.TextView[@text='去转入']",
            "小金库持仓");

}