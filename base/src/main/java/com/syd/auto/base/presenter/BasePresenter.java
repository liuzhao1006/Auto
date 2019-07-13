package com.syd.auto.base.presenter;

import com.syd.auto.base.presenter.view.IBaseView;
import com.syd.auto.base.presenter.view.IBasePresenter;

/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-10 06:56
 * 描述     :
 */
public abstract class  BasePresenter<T extends IBaseView> implements IBasePresenter<T> {
    protected T mView;
    protected BasePresenter() {
    }

    @Override
    public void attachView(T view) {
        this.mView = view;
    }
}
