package com.syd.auto.map.presenter;

import com.syd.auto.base.presenter.BasePresenter;
import com.syd.auto.map.presenter.view.IMapView;


/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-13 07:21
 * 描述     :
 */
public class MapPresenter extends BasePresenter<IMapView> {
    public void setShow(String map) {
        mView.showString(map);
    }
}
