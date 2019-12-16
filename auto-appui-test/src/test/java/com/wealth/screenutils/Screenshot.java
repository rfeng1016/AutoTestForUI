package com.wealth.screenutils;


import macaca.java.biz.BaseErrorType;
import macaca.java.biz.BaseMacacaClient;
import macaca.java.biz.ResultGenerator;
import com.wealth.utils.Config;

import java.io.File;

/**
 * Created by RuanFeng on 2019/8/25.
 *
 * 保存当前屏幕截图 - 生成的截图会按照截图的先后顺序生成有序的名称
 * @param fileName 图片名称，默认为.png格式,图片默认保存在screenShot目录下
 *
 */
public class Screenshot {

    // 屏幕截图的数目，为了实现递增的顺序
    private  int screenNum = 1;

    BaseMacacaClient driver= new BaseMacacaClient();

    public void saveScreen(String fileName){

        try{
            // 判断是否存在对应目录，不存在的话则创建
            File file = new File(Config.SCREEN_SHOT_PATH);
            if (!file.exists() || !file.isDirectory()){
                // 没有目录 创建截屏目录
                System.out.println("没有screenshot目录，创建目录");
                boolean isMkdirSucc = file.mkdir();
                if (isMkdirSucc){
                    System.out.println("创建screenshot目录成功");
                } else {
                    System.out.println("创建screenshot目录失败");
                }
            }else {
                System.out.println("存在screenshot目录");
            }

            driver.saveScreenshot(Config.SCREEN_SHOT_PATH + File.separator + screenNum + "_" + fileName + ".png");
            screenNum++;

        } catch (Exception e) {
            ResultGenerator.fail("截屏异常", "", BaseErrorType.FUNCTION_FAILED);
        }

    }


    // 删除screenshot目录下旧的截图
    public static void deleteOldScreen(File oldScreen){
        if (oldScreen.exists() && oldScreen.isDirectory()){
            File[] files = oldScreen.listFiles();
            for (File file : files){
                deleteOldScreen(file);
            }
        }else {
            oldScreen.delete();
        }
    }
}
