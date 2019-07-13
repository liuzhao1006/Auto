package com.syd.auto.base.presenter.view;

/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-10 07:10
 * 描述     :
 */
public interface IBasePresenter<T extends IBaseView> {

    /**
     * 绑定View
     */
    void attachView(T view);

}
