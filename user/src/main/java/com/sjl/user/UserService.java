package com.sjl.user;

import com.sjl.componentbase.service.IUserService;

/**
 * UserService
 *
 * @author 沈建林
 * @date 2019/10/30
 */
public class UserService implements IUserService {
    @Override
    public boolean isLogin() {
        return UserUtil.userInfo != null;
    }

    @Override
    public int getUserId() {
        return UserUtil.userInfo != null ? UserUtil.userInfo.getId() : 0;
    }
}
