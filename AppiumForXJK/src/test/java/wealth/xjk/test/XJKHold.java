package wealth.xjk.test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class XJKHold {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setCapability("deviceName","WBUBB19514508973");
        desiredCapabilities.setCapability("appPackage","com.jd.jrapp");
        desiredCapabilities.setCapability("appActivity","bm.mainbox.main.MainActivity");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("noReset", true);
        desiredCapabilities.setCapability("unicodeKeyboard", true);
        desiredCapabilities.setCapability("resetKeyboard", true);
        desiredCapabilities.setCapability("chromedriverExecutable", "/Users/maple/chromedriver/chromedriver");

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl,desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void xjkTest() throws InterruptedException{
        driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.jd.jrapp:id/iv_second_icon']").click();
        Thread.sleep(1000);
        System.out.println("理财页面");

        driver.findElementByXPath("//android.widget.TextView[@resource-id='com.jd.jrapp:id/tv_my_hold']").click();
        Thread.sleep(1000);
        System.out.println("进入总持仓页面了");

        driver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]").click();
        Thread.sleep(1000);
        System.out.println("进入小金库持仓了");

        driver.findElementByXPath("//android.widget.TextView[@text='转出']").click();
        Thread.sleep(3000);
        System.out.println("进入小金库转出页面了");


        driver.navigate().back();
        Thread.sleep(2000);

        driver.findElementByXPath("//android.widget.TextView[@text='转入']").click();
        Thread.sleep(4000);
        System.out.println("进入小金库转入页面了");

        driver.context("WEBVIEW_com.jd.jrapp");
        driver.findElementById("keyboard").click();
        Thread.sleep(2000);
        new TouchAction(driver).tap(PointOption.point(169,1600)).perform();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"confirmBtn\"]").click();
        System.out.println("进入转入成功页面了");

    }



    @After
    public void tearDown(){
//        driver.quit();
    }
}






























