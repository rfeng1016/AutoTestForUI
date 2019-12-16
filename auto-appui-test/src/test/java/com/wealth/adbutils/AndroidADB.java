package com.wealth.adbutils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by RuanFeng on 2019/8/25.
 */
public class AndroidADB {

    public static String runCommand(String command){

        BufferedReader bufferedReader = null;
        String line = null;
        InputStream inputStream =null;
        InputStreamReader inputStreamReader = null;

        try {
            Process process = Runtime.getRuntime().exec(command);
            inputStream = process.getInputStream();
            inputStreamReader = new InputStreamReader(inputStream,"utf-8");
            bufferedReader = new BufferedReader(inputStreamReader);
            while ((line = bufferedReader.readLine()) != null){
                return line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader != null){
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    //e.printStackTrace();
                }
            }
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    //e.printStackTrace();
                }
            }
            if (bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    //e.printStackTrace();
                }
            }
            return line;
        }
    }


    public static void main(String[] args){
        String result = AndroidADB.runCommand("/Users/maple/android-sdk-macosx/platform-tools/adb devices");
        System.out.println(result);
    }
}
