package pageobject.utils;

import com.alibaba.fastjson.JSONObject;
import macaca.client.MacacaClient;
import org.openqa.selenium.WebElement;

public class AppDriver {

    public static AppDriver<WebElement> driver1;

    public static void launchApp()  throws Exception{

        MacacaClient driver = new MacacaClient();
//        Logger logger = Logger.getLogger(String.valueOf(getClass()));
        JSONObject porps = new JSONObject();

        porps.put("platformName", "android");
        porps.put("package","com.jd.jrapp");
        porps.put("activity","com.jd.jrapp/.bm.mainbox.main.MainActivity");
        porps.put("autoAcceptAlerts",false);
        porps.put("reuse",3);

        JSONObject desiredCapabilities = new JSONObject();
        desiredCapabilities.put("desiredCapabilities", porps);

        driver.initDriver(desiredCapabilities);

//        logger.info("启动APP了!");

    }
}
