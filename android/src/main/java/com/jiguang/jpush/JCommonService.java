package com.jiguang.jpush;

/**
 * Created by ZhqoQi on 2021/2/24 10:48
 * E-Mail Address：550655294@qq.com
 */

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;

public class JCommonService extends Service {
    private static final String TAG = "JCommonService";
    IBinder mBinder = null;

    public JCommonService() {
    }

    public final void onCreate() {
        super.onCreate();
    }

    public final boolean onUnbind(Intent var1) {
        return super.onUnbind(var1);
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    public final void onConfigurationChanged(Configuration var1) {
        super.onConfigurationChanged(var1);
    }

    public final void onLowMemory() {
        super.onLowMemory();
    }

    public final void onRebind(Intent var1) {
        super.onRebind(var1);
    }

    public final void onTaskRemoved(Intent var1) {
        super.onTaskRemoved(var1);
    }

    public final void onTrimMemory(int var1) {
        super.onTrimMemory(var1);
    }

    public final void onStart(Intent var1, int var2) {
        super.onStart(var1, var2);
    }

    public final IBinder onBind(Intent var1) {
        return mBinder;
    }

    public final int onStartCommand(Intent var1, int var2, int var3) {

        return super.onStartCommand(var1, var2, var3);
    }
}

