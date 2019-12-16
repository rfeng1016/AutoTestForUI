package pageobject.testcase;

import org.junit.*;
import pageobject.pages.MyHomePage;
import pageobject.utils.AppDriver;

import java.net.MalformedURLException;

public class XJKCaseTest {


    @Before
    public void before() throws MalformedURLException{
        AppDriver.launchApp();
    }


    @Test
    public void autotest() throws InterruptedException{
        new MyHomePage()
                .tapWealth()
                .tapMyPosition()
                .xjkTitle()
                .xjkPayOut()
                .backtoxjk()
                .xjkPayin()
                .payintoxjk();
    }


    @After
    public void after() throws MalformedURLException{
        //driver.quit();
    }
}
