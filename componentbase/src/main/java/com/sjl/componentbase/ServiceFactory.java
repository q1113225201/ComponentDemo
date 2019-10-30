package com.sjl.componentbase;

import com.sjl.componentbase.service.IUserService;
import com.sjl.componentbase.service.UserServiceImpl;

/**
 * ServiceFactory
 * 提供一些各组件方法
 * @author 沈建林
 * @date 2019/10/30
 */
public class ServiceFactory {
    public static class ClassHolder {
        private static ServiceFactory serviceFactory = new ServiceFactory();
    }

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return ClassHolder.serviceFactory;
    }

    private IUserService userService;

    public IUserService getUserService() {
        if (userService == null) {
            userService = new UserServiceImpl();
        }
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}
