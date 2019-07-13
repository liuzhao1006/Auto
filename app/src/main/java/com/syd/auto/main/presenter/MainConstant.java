package com.syd.auto.main.presenter;

import com.syd.auto.base.presenter.view.IBaseView;
import com.syd.auto.base.presenter.view.IBasePresenter;

/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-11 17:31
 * 描述     :
 */
@Deprecated
public class MainConstant {
    interface MainViewI extends IBaseView {
        void onMainView();
    }
    interface MainPresenter extends IBasePresenter<MainViewI>{
        void onMainStart();
    }
}
