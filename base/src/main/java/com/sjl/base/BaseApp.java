package com.sjl.base;

import android.app.Application;

/**
 * BaseApp
 *
 * @author 沈建林
 * @date 2019/10/30
 */
public abstract class BaseApp extends Application {
    /**
     * Application 初始化
     *
     * @param application
     */
    public abstract void initModuleApp(Application application);

    /**
     * Application 初始化后自定义操作
     * @param application
     */
    public abstract void initModuleData(Application application);
}
