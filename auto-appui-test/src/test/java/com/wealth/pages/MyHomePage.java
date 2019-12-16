package com.wealth.pages;

import com.alibaba.fastjson.JSONObject;
import com.wealth.pageuis.FinancialHomePageUI;
import com.wealth.pageuis.MyHomePageUI;
import macaca.client.commands.Element;
import macaca.java.biz.BasePage;
import macaca.java.biz.CommonUIBean;

public class MyHomePage extends BasePage{

    public MyHomePage(String pageDesc){
        super(pageDesc);
    }

    /**
     * 环境按钮向上滑动
     */
    public void btnEnvScroll() throws Exception{
        //获取环境按钮操作元素
        Element elementBtuEnv = driver.elementByXPath("//android.widget.TextView[@resource-id='com.jd.jrapp:id/tv_env']");

        //获取用户头像操作元素
        Element elementPortrait = driver.elementByXPath("//android.widget.ImageView[@resource-id='com.jd.jrapp:id/home_title_portrait']");

        //获取环境按钮的坐标
        int btuEnvPointX = (int) elementBtuEnv.getCenterX();
        System.out.println("环境按钮X坐标："+btuEnvPointX);
        int btuEnvPointY = (int) elementBtuEnv.getCenterY();
        System.out.println("环境按钮Y坐标："+btuEnvPointY);

        //获取用户头像的坐标
        int portraitPointX = (int) elementPortrait.getCenterX();
        System.out.println("用户头像X坐标："+portraitPointX);
        int portraitPointY = (int) elementPortrait.getCenterY();
        System.out.println("用户头像Y坐标："+portraitPointY);

        driver.drag(btuEnvPointX,btuEnvPointY,portraitPointX,portraitPointY,2);
    }



    /**
     * 点击用户账号头像
     */
    public void usersGridTitle() throws Exception{
        driver.onclickBean(MyHomePageUI.PORTRAIT_TITLE);
    }

    /**
     * 上下滑动
     *
     * @throws Exception
     */
    public void scroll() throws Exception{
        JSONObject windowSize = driver.getWindowSize();
        int windowWidth = windowSize.getIntValue("width");
        System.out.println("宽度："+windowWidth);
        int windowHeight = windowSize.getIntValue("height");
        System.out.println("高度："+windowHeight);

        int centerX = (int) windowWidth / 2;
        System.out.println("X坐标："+centerX);
        int centerY = (int) windowWidth / 2;
        System.out.println("Y坐标："+centerY);

//        driver.swipe(centerX,(int)windowHeight-100, centerX, 300, 500);
//        driver.drag(centerX, (int) windowHeight - 100, centerX, 300, 0.05);
        driver.drag(centerX, centerY, centerX, centerY/4, 0.5);
        driver.sleep(1000);
//        driver.swipe(centerX, 300, centerX, (int)windowHeight-100, 500);
//        driver.drag(centerX, 300, centerX, (int) windowHeight - 100, 0.05);
    }

    /**
     * 向下滑动后点击我的资产：也就是打开总持仓
     */
    public void holdGridTitle() throws Exception{
        driver.onclickBean(MyHomePageUI.HOLD_GRID_TITLE);
    }






}

