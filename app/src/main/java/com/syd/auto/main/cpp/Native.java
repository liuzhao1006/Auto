package com.syd.auto.main.cpp;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-11 21:44
 * 描述     :
 */
public class Native {
    static {
        System.loadLibrary("native-lib");
    }

    public native String stringFromJNI();
    public native byte[] start();
    public native int getIntCode();
    public native InputStream getInputStream();
    public native OutputStream getOutputStream();
}
