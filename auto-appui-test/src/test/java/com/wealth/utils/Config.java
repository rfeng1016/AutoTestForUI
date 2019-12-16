package com.wealth.utils;

import java.io.File;


public class Config {

    //根目录
    public static final String ROOT_PATH = System.getProperty("user.dir");
    //截图保存目录
    public static final String SCREEN_SHOT_PATH = ROOT_PATH + File.separator + "screenshot";
    //结果日志保存文件
    public static final String RESULT_LOG_PATH = ROOT_PATH + File.separator + "result.log";

    // 用户名
    public static final String USER_NAME = "JRusername";
    // 密码
    public static final String PASSWORD = "JRpassword";


    // 目标平台 - Android
    public static final String PLATFORM = "android";

    //Android平台相关信息
    public static final String ADR_PLATFORM_NAME = "Android";

    //Android app 的 package name。
    public static final String ADR_PACKAGE = "com.jd.jrapp";

    //启动时的 Activity name。
    //public static final String ADR_ACTIVITY = "com.jd.jrapp.WelcomeActivity";
    public static final String ADR_ACTIVITY = "com.jd.jrapp/.bm.mainbox.main.MainActivity";

    //多台设备时，如果指定某一台设备可以在这里指定udid
//    public static final String ADR_UDID = "7c2497f9";
    public static final String ADR_UDID = "WBUBB19514508973";
//    public static final String ADR_UDID = "DLLKR17105010905";

    //自动接受所有的系统弹窗信息。默认是 false。
    public static final Boolean ADR_AUTO_ACCEPT_ALERTS = false;

    //自动拒绝所有的系统弹窗信息。默认是 false。
    public static final Boolean ADR_AUTO_DISMISS_ALERTS = true;

    //是否等待传入 App 的 Acitivity 加载完成。 默认是 false。
    public static final Boolean ADR_IS_WAIT_ACTIVITY = true;

    //使用 chromedriver 测试 webview 时需要的自定义的进程名。
    public static final String ADR_ANDROID_PROCESS = "";



    public static final String ADR_APP = ROOT_PATH + File.separator + "app/android-app-bootstrap.zip";

    //0: 清除数据并重装app。
    public static final int REUSE_0 = 0;
    //1: (默认) 卸载并重装app。
    public static final int REUSE_1 = 1;
    //2: 仅重装 app。
    public static final int REUSE_2 = 2;
    //3: 在测试结束后保持app状态
    public static final int REUSE_3 = 3;





}
