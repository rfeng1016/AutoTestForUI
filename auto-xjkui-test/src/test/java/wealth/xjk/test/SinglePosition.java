package wealth.xjk.test;


import com.alibaba.fastjson.JSONObject;
import macaca.client.MacacaClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class SinglePosition {

    MacacaClient driver = new MacacaClient();

    File directory = new File("");
    public String courseFile = directory.getCanonicalPath();

    public SinglePosition() throws IOException{

    }


    @Before
    public void setUp() throws Exception{

        Logger logger = Logger.getLogger(String.valueOf(getClass()));
        JSONObject porps = new JSONObject();

        porps.put("platformName", "android");                               // android or ios
        porps.put("package","com.jd.jrapp");                                // package name
        porps.put("activity","com.jd.jrapp/.bm.mainbox.main.MainActivity");               //Activity name
        porps.put("autoAcceptAlerts", true);                                //自动接受所有的系统弹窗信息
        /*
            0: 清楚数据并重装 app。
            1: (默认) 卸载并重装 app。
            2: 仅重装 app。
            3: 在测试结束后保持 app 状态
         */
        porps.put("reuse",3);
//        porps.put("udid","HT65V0100644");

        JSONObject desiredCapabilities = new JSONObject();
        desiredCapabilities.put("desiredCapabilities", porps);
        driver.initDriver(desiredCapabilities);

        logger.info("启动APP了!");

        //adb shell pm clear com.jd.jrapp
        //macaca server --verbose


    }


    @Test
    public void xjkCaseSinglePosition() throws Exception{

        //入口
        driver.elementByXPath("//android.widget.TextView[@text='小金库']").click();
        driver.sleep(1000);


        //交易单
        driver.elementByXPath("//android.widget.TextView[@resource-id='com.jd.jrapp:id/tv_right']").click();
        driver.sleep(1000);

        //返回
        driver.back();

        //收益金钱显示
        driver.elementByXPath("//android.widget.FrameLayout[@resource-id='com.jd.jrapp:id/view_eye']/android.widget.ImageView[1]").click();
        driver.sleep(1000);
        driver.elementByXPath("//android.widget.FrameLayout[@resource-id='com.jd.jrapp:id/view_eye']/android.widget.ImageView[1]").click();

        //最新收益
        driver.elementByXPath("//android.widget.TextView[@text='最新收益']").click();
        driver.sleep(1000);
        driver.back();

        //万份收益
        driver.elementByXPath("//android.widget.TextView[@text='万份收益']").click();
        driver.sleep(1000);
        driver.back();

        //七日年化收益
        driver.elementByXPath("//android.widget.TextView[@text='七日年化收益']").click();
        driver.sleep(1000);
        driver.back();
/*
        //存工资
        driver.elementByXPath("//android.widget.TextView[@text='存工资']").click();
        driver.sleep(1000);
        driver.back();

        //还信用卡
        driver.elementByXPath("//android.widget.TextView[@text='还信用卡']").click();
        driver.sleep(1000);
        driver.back();

        //还白条
        driver.elementByXPath("//android.widget.TextView[@text='还白条']").click();
        driver.sleep(1000);
        driver.back();

        //小金卡
        driver.elementByXPath("//android.widget.TextView[@text='小金卡']").click();
        driver.sleep(1000);
        driver.back();

        //向下滑动
        driver.drag(750, 2000, 750, 450, 0.5);

        //推荐位
        driver.elementByXPath("//android.widget.LinearLayout[@resource-id='com.jd.jrapp:id/main_content']/android.widget.RelativeLayout[1]").click();
        driver.sleep(1000);
        driver.back();
        driver.elementByXPath("//android.widget.LinearLayout[@resource-id='com.jd.jrapp:id/main_content']/android.widget.RelativeLayout[2]").click();
        driver.sleep(1000);
        driver.back();
        driver.elementByXPath("//android.widget.LinearLayout[@resource-id='com.jd.jrapp:id/main_content']/android.widget.RelativeLayout[3]").click();
        driver.sleep(1000);
        driver.back();
        driver.elementByXPath("//android.widget.LinearLayout[@resource-id='com.jd.jrapp:id/main_content']/android.widget.RelativeLayout[4]").click();
        driver.sleep(1000);
        driver.back();

        //帮助
        driver.elementByXPath("//android.widget.LinearLayout[@resource-id='com.jd.jrapp:id/layout_bottom']/android.widget.LinearLayout[1]").click();
        driver.sleep(1000);
        driver.back();
*/
        //转出
        driver.elementByXPath("//android.widget.TextView[@text='转出']").click();
        driver.sleep(1000);
        driver.back();

        //转入
        driver.elementByXPath("//android.widget.TextView[@text='转入']").click();
        driver.sleep(1000);
        driver.back();



        System.out.println("1111111111111111111111111");

    }


    @After
    public void tearDown() throws Exception{
        //driver.quit();
    }
}
