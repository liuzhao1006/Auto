package com.syd.auto.base.ui.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.syd.auto.base.presenter.view.IBaseView;
import com.syd.auto.base.presenter.view.IBasePresenter;


/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-10 07:00
 * 描述     :
 */
public abstract class IBaseMvpActivity<T extends IBasePresenter> extends BaseActivity implements IBaseView {

    //P层的应用
    protected T mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initPresenter();
        if(mPresenter != null){
            mPresenter.attachView(this);
        }
        initView(savedInstanceState);
    }
    protected abstract int getLayoutId();
    protected abstract void initPresenter();
    protected abstract void initView(Bundle savedInstanceState);
}
