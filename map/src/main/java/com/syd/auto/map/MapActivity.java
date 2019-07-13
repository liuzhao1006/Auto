package com.syd.auto.map;

import android.os.Bundle;
import android.widget.Toast;

import com.syd.auto.base.presenter.BasePresenter;
import com.syd.auto.base.ui.activity.BaseActivity;
import com.syd.auto.base.ui.activity.IBaseMvpActivity;
import com.syd.auto.map.presenter.MapPresenter;
import com.syd.auto.map.presenter.view.IMapView;


/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-13 06:59
 * 描述     :
 */
public class MapActivity extends IBaseMvpActivity<MapPresenter> implements IMapView {
    @Override
    protected int getLayoutId() {
        return R.layout.map_activity_map;
    }

    @Override
    protected void initPresenter() {
        mPresenter = new MapPresenter();
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        mPresenter.setShow("Map_liu");
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void hideDialog() {

    }

    @Override
    public void onError() {

    }

    @Override
    public void showString(String map) {
        Toast.makeText(MapActivity.this,map,Toast.LENGTH_SHORT).show();
    }
}
