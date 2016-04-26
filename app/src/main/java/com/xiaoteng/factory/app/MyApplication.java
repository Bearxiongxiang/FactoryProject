package com.xiaoteng.factory.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/4/18.
 */
public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static Context getContext() {
        return context;
    }

}
