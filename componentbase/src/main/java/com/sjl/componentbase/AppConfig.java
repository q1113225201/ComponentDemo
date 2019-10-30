package com.sjl.componentbase;

/**
 * AppConfig
 * 组件App配置
 *
 * @author 沈建林
 * @date 2019/10/30
 */
public class AppConfig {
    private static final String UserApp = "com.sjl.user.UserApp";
    private static final String MessageApp = "com.sjl.user.MessageApp";

    public static String[] moduleApps = {
            UserApp,
            MessageApp,
    };
}
