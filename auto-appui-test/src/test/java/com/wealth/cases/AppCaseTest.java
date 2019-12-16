package com.wealth.cases;


import com.wealth.pages.MyHoldPage;
import com.wealth.pages.MyHomePage;
import com.wealth.pages.XJKPositionPage;
import macaca.client.MacacaClient;
import org.junit.Test;

import java.util.logging.Logger;

public class AppCaseTest extends BaseTest{

    Logger logger = Logger.getLogger(String.valueOf(getClass()));

    @Test
    public void test() throws Exception{

        //从个人主页面进入总持仓
        MyHomePage myHomePage = new MyHomePage("从个人主页面进入总持仓");
        myHomePage.setDriver(driver);
        myHomePage.usersGridTitle();
        logger.info("进入用户主页!");
        driver.sleep(1000);
        myHomePage.scroll();
        driver.sleep(1000);
        myHomePage.holdGridTitle();
        logger.info("进入总持仓!");
        driver.sleep(1000);


        //从总持仓进入小金库持仓
        MyHoldPage myHoldPage = new MyHoldPage("从总持仓进入小金库持仓");
        myHoldPage.setDriver(driver);
        myHoldPage.xjkTitle();
        logger.info("进入小金库持仓!");
        driver.sleep(5000);

        //小金库case
//        XJKPositionPage xjkPositionPage = new XJKPositionPage("小金库持仓");
//        xjkPositionPage.setDriver(driver);
//        driver.switchFromNativeToWebView();
//        driver.switchFromeWebviewToNative();

//        driver.waitForElementByXPath("//android.widget.TextView[@text='转入']");


        //最新收益
        MacacaClient driver1 = new MacacaClient();
        try {
            driver.waitForElementByXPath("//android.widget.TextView[@resource-id='com.jd.jrapp:id/tv_right']");
            driver.sleep(1000);
        }catch (Exception e){
            driver.sleep(1000);
            driver.waitForElementByXPath("//android.widget.TextView[@resource-id='com.jd.jrapp:id/tv_right']");
        }
        //万分收益
        //七日年化收益

//        //小金库转入
//        xjkPositionPage.xjkPayin();
//        logger.info("进入小金库转入页面了!");
//        driver.sleep(5000);
//
//
//        //返回小金库持仓
//        driver.back();
//        driver.sleep(3000);
//
//
//        //小金库转出
//        xjkPositionPage.xjkPayOut();
//        logger.info("进入小金库转出页面了!");
//        driver.sleep(5000);






    }

}
