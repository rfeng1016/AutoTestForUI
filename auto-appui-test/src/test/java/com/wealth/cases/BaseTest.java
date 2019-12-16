package com.wealth.cases;

import java.io.File;
import java.util.logging.Logger;

import com.wealth.screenutils.Screenshot;
import org.junit.After;
import org.junit.Before;

import macaca.java.biz.BaseMacacaClient;
import macaca.java.biz.ResultGenerator;
import macaca.java.biz.BaseMacacaClient.PlatformType;
import com.wealth.utils.Config;
import com.alibaba.fastjson.JSONObject;

public class BaseTest {

    BaseMacacaClient driver = new BaseMacacaClient();

    @Before
    public void setUp() throws Exception {

        // 清除日志记录
        ResultGenerator.clearOldData();

        //清理截图重新记录
        File file = new File(Config.SCREEN_SHOT_PATH);
        Screenshot.deleteOldScreen(file);

        // 初始化应用基础信息
        Logger logger = Logger.getLogger(String.valueOf(getClass()));
        JSONObject porps = new JSONObject();
        if (Config.PLATFORM.equals("android")) {

            // 创建Android实例
            porps.put("platformName", Config.ADR_PLATFORM_NAME);
            porps.put("package", Config.ADR_PACKAGE);
            porps.put("activity", Config.ADR_ACTIVITY);
            porps.put("autoAcceptAlerts", Config.ADR_AUTO_ACCEPT_ALERTS);
            porps.put("autoDismissAlerts",Config.ADR_AUTO_DISMISS_ALERTS);
            porps.put("isWaitActivity",Config.ADR_IS_WAIT_ACTIVITY);
            porps.put("reuse", Config.REUSE_3);
            porps.put("udid",Config.ADR_UDID);
            porps.put("newCommandTimeOut",100);
            driver.setCurPlatform(PlatformType.ANDROID);
        } else {
            System.out.println("创建iOS实例");
        }

        JSONObject desiredCapabilities = new JSONObject();
        desiredCapabilities.put("desiredCapabilities", porps);
        driver.initDriver(desiredCapabilities);
        logger.info("启动APP了!");

    }


    @After
    public void tearDown() throws Exception {

//        try {
//            driver.quit();
//        } catch (Exception e) {
//            ResultGenerator.fail("quit fail", "", BaseErrorType.FUNCTION_FAILED);
//        }

    }
}
