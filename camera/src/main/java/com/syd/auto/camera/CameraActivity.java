package com.syd.auto.camera;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.syd.auto.base.ui.activity.IBaseMvpActivity;
import com.syd.auto.camera.presenter.CameraPresenter;
import com.syd.auto.camera.presenter.view.ICameraView;


/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-09 18:55
 * 描述     :
 */
public class CameraActivity extends IBaseMvpActivity<CameraPresenter> implements ICameraView {

    @Override
    protected int getLayoutId() {
        return R.layout.camera_activity_camera;
    }

    @Override
    protected void initPresenter() {
        mPresenter = new CameraPresenter();
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        Intent intent = getIntent();
        if(intent != null){
            String camera = intent.getStringExtra("camera");
            if(camera != null){
                Toast.makeText(this, camera,Toast.LENGTH_SHORT).show();
            }
        }
        mPresenter.setVideo(CameraActivity.this, findViewById(R.id.jz_video));
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
    public void showDialog(String test) {
        Toast.makeText(CameraActivity.this,test,Toast.LENGTH_SHORT).show();
    }
}
