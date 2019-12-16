package wealth.xjk.test;

import com.alibaba.fastjson.JSONObject;
import macaca.client.MacacaClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class Posistion {

    MacacaClient driver = new MacacaClient();

    File directory = new File("");
    public String courseFile = directory.getCanonicalPath();

    public Posistion() throws IOException {

    }

    @Before
    public void setUp() throws Exception{

        Logger logger = Logger.getLogger(String.valueOf(getClass()));
        JSONObject porps = new JSONObject();

        porps.put("platformName", "android");                               // android or ios
        porps.put("package","com.jd.jrapp");                                // package name
        porps.put("activity","com.jd.jrapp.WelcomeActivity");               //Activity name
//        porps.put("autoAcceptAlerts", true);
        porps.put("autoDismissAlerts",false);
        porps.put("unicodeKeyboard", true);
        porps.put("resetKeyboard", true);
        /*
            0: 清楚数据并重装 app。
            1: (默认) 卸载并重装 app。
            2: 仅重装 app。
            3: 在测试结束后保持 app 状态
         */
        porps.put("reuse",3);
        porps.put("udid","7c2497f9");

        JSONObject desiredCapabilities = new JSONObject();
        desiredCapabilities.put("desiredCapabilities", porps);
        driver.initDriver(desiredCapabilities);

        logger.info("启动APP了!");

        //adb shell pm clear com.jd.jrapp
        //macaca server --verbose


    }



    @Test
    public void financialPosition() throws Exception{
/*
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

        driver.sleep(5000);

        driver.elementByXPath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup[1]").click();

        driver.sleep(5000);

        driver.elementByXPath("//android.widget.TextView[@text='转入']").click();
*/





        //理财页面
        driver.sleep(5000);
        driver.elementByXPath("//android.widget.ImageView[@resource-id='com.jd.jrapp:id/iv_second_icon']").click();
        System.out.println("理财页面");
        driver.sleep(5000);


        //我的持仓
        driver.elementByXPath("//android.widget.TextView[@resource-id='com.jd.jrapp:id/tv_my_hold']").click();
        System.out.println("进入持仓页面了");

        //小金库持仓
        driver.waitForElementByXPath("//android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]").click();
        System.out.println("进入小金库持仓了");

        //小金库转出页面
        driver.waitForElementByXPath("//android.widget.TextView[@text='转出']").click();
        //driver.waitForElementByXPath("//android.widget.TextView[@text='转出']").getRect();
        driver.sleep(2000);


        //Element element = driver.elementByXPath("//android.widget.TextView[@text='转出']");


//        JSONArray contexts = driver.contexts();
//        driver.context(contexts.get(contexts.size() - 1).toString());

        //转出说明
        //driver.elementByCss("#payoutPage > div > div.coffer-choosepanel.mt20 > div.titlebar.pl32.pr32.b.b-b > small").click();

        /*
        Element element = driver.elementByCss("#payoutPage > div > div.coffer-choosepanel.mt20 > div.titlebar.pl32.pr32.b.b-b > small");
        System.out.println("11111111111111111111111111");
        element.getOriginX();
        System.out.println("222222222222222222222222222");
        System.out.println(element.getOriginX());
        System.out.println("33333333333333333333333333333");

        //driver.sleep(1000);

        /*
        double width = driver.element.getWidth();
        double height = driver.element.getHeight();

        System.out.println(width);
        System.out.println(height);


         */

        //唤起安全键盘
        driver.elementByCss("#payoutPage > div > div.coffer-input-section.jrm-bg-color-fff.coffer-rmb-icon > div").click();
        driver.sleep(1000);


        //String source = driver.source();
        //System.out.println(source)
//
//        driver.context(contexts.get(0).toString());
//
//
//
//        Element element_1 = driver.elementByXPath("//*[@id=\"payEightSubmitPayout\"]/div/ul[1]/li[1]/div[1]");
//        Element element_2 = driver.elementByXPath("//*[@id=\"payEightSubmitPayout\"]/div/ul[1]/li[1]/div[2]");
//        Element element_3 = driver.elementByXPath("//*[@id=\"payEightSubmitPayout\"]/div/ul[1]/li[1]/div[3]");
//
//
//        element_1.getCenterX();
//
//
//        double Y= element_1.getCenterY();


        //List<Element> elements =  driver.elementByCss("#payEightSubmitPayout > div > ul.pct100.font-family-udc > li.mt10 > div:nth-child(1)");
//        System.out.println(element_1);
//        System.out.println(element_2);
//        System.out.println(element_3);
        //rect = elements.rect;








        /*

        //唤起安全键盘
        driver.elementByCss("#payoutPage > div > div.coffer-input-section.jrm-bg-color-fff.coffer-rmb-icon > div").click();
        driver.sleep(1000);


        driver.context("NATIVE_APP");

        //输入金额1元
        //driver.elementByCss("#payEightSubmitPayout > div > ul.pct100.font-family-udc > li.mt10 > div:nth-child(1)").sendKeys("1000");
        //driver.tap(164,1382);
        driver.tap(181,1400);
        driver.sleep(1000);
        System.out.println("输入金额成功 158 1408");

        //落下安全键盘
        driver.tap(949,1758);
        driver.sleep(1000);

        //driver.context("WEBVIEW");
        driver.context(contexts.get(contexts.size()-1).toString());

        driver.elementByCss("#payoutPage > div > div.mt40.mb40.pl32.pr32 > p").click();
        driver.sleep(1000);

        driver.context("NATIVE_APP");




        driver.tap(897,1375);
        driver.sleep(1000);

        driver.tap(538,1378);
        driver.sleep(1000);

        driver.tap(538,1530);
        driver.sleep(1000);

        driver.tap(907,1658);
        driver.sleep(1000);

        driver.tap(179,1370);
        driver.sleep(1000);

        driver.tap(179,1370);
        driver.sleep(1000);

        driver.context(contexts.get(contexts.size()-1).toString());

        driver.elementByCss("#payoutPage > div.coffer-pop-window > div > div.content.center.anim > div > div.center > div.btn.btn-confirm.mt40.pressed").click();


        //理财金转入
        //driver.switchFromNativeToWebView();


        //零用钱转入

        //小金库转出

        //driver.back();
        //driver.back();
        //小金保持仓
        //driver.elementByXPath("//android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[5]").click();
        //driver.sleep(2000);

         */

        //小金库转出

        //小金保转出
        //driver.back();


        //向下滑动
        //driver.drag(750, 2000, 750, 450, 0.5);

        //基金持仓




        //理财金转入

        //driver.switchFromNativeToWebView();

        //零用钱转入

        //小金库转出

        //小金保持仓

        //基金持仓








    }


    @After
    public void tearDown() throws Exception{
        //driver.quit();
    }


}
