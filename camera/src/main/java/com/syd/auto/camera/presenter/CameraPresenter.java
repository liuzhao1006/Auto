package com.syd.auto.camera.presenter;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.syd.auto.base.presenter.BasePresenter;
import com.syd.auto.camera.presenter.view.ICameraView;
import com.syd.auto.camera.tools.CameraLife;

/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-13 07:39
 * 描述     :
 */
public class CameraPresenter extends BasePresenter<ICameraView>  {
    private CameraLife life = null;
    public void setVideo(Context context,CameraLife life) {
        this.life = life;
        life.setUp("http://jzvd.nathen.cn/342a5f7ef6124a4a8faf00e738b8bee4/cf6d9db0bd4d41f59d09ea0a81e918fd-5287d2089db37e62345123a1be272f8b.mp4"
                , "饺子快长大");
        Glide.with(context).load("http://jzvd-pic.nathen.cn/jzvd-pic/1bb2ebbe-140d-4e2e-abd2-9e7e564f71ac.png").into(life.thumbImageView);
    }
}
