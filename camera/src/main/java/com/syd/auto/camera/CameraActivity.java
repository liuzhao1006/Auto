package com.syd.auto.camera;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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
        String camera = intent.getStringExtra("camera");
        Toast.makeText(this, camera,Toast.LENGTH_SHORT).show();
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
}
