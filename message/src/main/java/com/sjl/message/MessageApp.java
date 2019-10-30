package com.sjl.message;

import android.app.Application;

import com.sjl.base.BaseApp;

/**
 * MessageApp
 *
 * @author 沈建林
 * @date 2019/10/30
 */
public class MessageApp extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {

    }

    @Override
    public void initModuleData(Application application) {

    }
}
