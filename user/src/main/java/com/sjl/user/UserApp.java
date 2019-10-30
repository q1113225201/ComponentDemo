package com.sjl.user;

import android.app.Application;

import com.sjl.base.BaseApp;
import com.sjl.componentbase.ServiceFactory;

/**
 * UserApp
 *
 * @author 沈建林
 * @date 2019/10/30
 */
public class UserApp extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setUserService(new UserService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
