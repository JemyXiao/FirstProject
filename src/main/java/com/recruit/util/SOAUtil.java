package com.recruit.util;

import org.springframework.util.ResourceUtils;

import java.io.IOException;

public class SOAUtil {
    public static String initSOAClient() {
        String filePath = null;
        try {
            filePath = ResourceUtils.getFile(System.getProperty("user.dir") + "/upload/").getAbsolutePath();
        } catch (IOException ex) {
            //TODO
        }
        return filePath;
    }

//    public static void main(String[] args) {
//        URL url = SOAUtil.class.getResource("/config.properties");
//        System.err.println(url);
//    }
}