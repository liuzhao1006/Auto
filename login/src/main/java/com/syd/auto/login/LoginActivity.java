package com.syd.auto.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.syd.auto.base.ui.activity.IBaseMvpActivity;
import com.syd.auto.login.presenter.LoginPresenter;
import com.syd.auto.login.presenter.view.ILoginView;


/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-13 06:59
 * 描述     :
 */
public class LoginActivity extends IBaseMvpActivity<LoginPresenter> implements ILoginView {

    @Override
    protected int getLayoutId() {
        return R.layout.login_activity_login;
    }
    @Override
    protected void initPresenter() {
        mPresenter = new LoginPresenter();
    }
    @Override
    protected void initView(Bundle savedInstanceState) {
        Button btnTest = findViewById(R.id.login_btn_login);
        btnTest.setOnClickListener(view -> mPresenter.setLoginInfo());

    }

    @Override
    public void showDialog() {
        Toast.makeText(LoginActivity.this,"show",Toast.LENGTH_LONG).show();
    }

    @Override
    public void hideDialog() {
        Toast.makeText(LoginActivity.this,"hide",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onError() {
        Toast.makeText(LoginActivity.this,"error",Toast.LENGTH_LONG).show();
    }
}
