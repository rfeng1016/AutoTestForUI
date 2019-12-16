package com.wealth.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

public class MyHomePageUI extends BasePageUI {


    public static final CommonUIBean PORTRAIT_TITLE  = new CommonUIBean(GetElementWay.XPATH,
            "//android.widget.ImageView[@resource-id='com.jd.jrapp:id/home_title_portrait']",
            "账号头像");


    public static final CommonUIBean HOLD_GRID_TITLE = new CommonUIBean(GetElementWay.XPATH,
            "//android.support.v7.widget.RecyclerView[@resource-id='com.jd.jrapp:id/jr_widget_srl_recyclerview']/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[4]/android.widget.ImageView[1]",
            "小金库");



}
