package com.example.android.reportcard;

import android.app.Application;
import android.content.Context;

/**
 * Created by marvinramirez on 2017-10-01.
 */

public class App extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext(){
        return mContext;
    }
}