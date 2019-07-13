package com.syd.auto.login.presenter;

import com.syd.auto.base.presenter.BasePresenter;
import com.syd.auto.login.presenter.view.ILoginView;

/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-13 07:03
 * 描述     :
 */
public class LoginPresenter extends BasePresenter<ILoginView> {
    public LoginPresenter() {
    }

    public void setLoginInfo() {
        mView.showDialog();
    }
}
