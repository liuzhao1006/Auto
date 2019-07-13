package com.syd.auto.main.presenter;

import com.syd.auto.base.presenter.BasePresenter;
import com.syd.auto.main.cpp.Native;
import com.syd.auto.main.presenter.view.MainViewI;


/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-10 07:55
 * 描述     :
 */
public class MainPresenter extends BasePresenter<MainViewI> {

    private final Native mNative;

    public MainPresenter() {
        mNative = new Native();
    }

    public void show(){
        mNative.getInputStream();
        mView.showDialog();
    }

    public void hide(){
        mNative.getOutputStream();
        mView.hideDialog();
    }

    public void error(){
        mNative.getIntCode();
        mView.onError();
    }

    public String getCpp() {
       return mNative.stringFromJNI();
    }
}
