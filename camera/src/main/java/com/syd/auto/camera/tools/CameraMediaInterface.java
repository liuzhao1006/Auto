package com.syd.auto.camera.tools;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.TextureView;


/**
 * 作者      : 刘朝
 * 创建日期  : 2019-07-14 00:03
 * 描述     :
 */
public abstract class CameraMediaInterface implements TextureView.SurfaceTextureListener {
    public static SurfaceTexture SAVED_SURFACE;
    public HandlerThread mMediaHandlerThread;
    public Handler mMediaHandler;
    public Handler handler;
    public CameraVd cameraVd;
    public CameraMediaInterface(CameraVd cameraVd) {
        this.cameraVd = cameraVd;
    }

    public abstract void start();

    public abstract void prepare();

    public abstract void pause();

    public abstract boolean isPlaying();

    public abstract void seekTo(long time);

    public abstract void release();

    public abstract long getCurrentPosition();

    public abstract long getDuration();

    public abstract void setVolume(float leftVolume, float rightVolume);

    public abstract void setSpeed(float speed);

    public abstract void setSurface(Surface surface);
}
