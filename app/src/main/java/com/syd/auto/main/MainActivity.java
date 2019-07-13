package com.syd.auto.main;

import androidx.annotation.NonNull;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.syd.auto.R;
import com.syd.auto.base.ui.activity.IBaseMvpActivity;
import com.syd.auto.camera.CameraActivity;
import com.syd.auto.main.presenter.MainPresenter;
import com.syd.auto.main.presenter.view.MainViewI;

public class MainActivity extends IBaseMvpActivity<MainPresenter> implements MainViewI {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initPresenter() {
        mPresenter = new MainPresenter();
    }
    @Override
    protected void initView(@NonNull Bundle savedInstanceState) {
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(mPresenter.getCpp());
        findViewById(R.id.btn_regist).setOnClickListener(view -> mPresenter.show());
    }

    @Override
    public void showDialog() {
        Toast.makeText(this,"show",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, CameraActivity.class);
        intent.putExtra("camera","start_camera");
        startActivity(intent);
    }

    @Override
    public void hideDialog() {
        Toast.makeText(this,"hideDialog",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError() {
        Toast.makeText(this,"onError",Toast.LENGTH_SHORT).show();
    }
}
