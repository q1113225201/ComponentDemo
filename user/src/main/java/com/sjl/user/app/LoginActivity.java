package com.sjl.user.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.sjl.componentbase.ServiceFactory;
import com.sjl.user.R;
import com.sjl.user.UserUtil;
import com.sjl.user.model.UserInfo;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = "/user/login")
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setUsername("123456");
        UserUtil.userInfo = userInfo;
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    public void logout(View view) {
        UserUtil.userInfo = null;
        Toast.makeText(this, "登出成功", Toast.LENGTH_SHORT).show();
    }

    public void toMessage(View view) {
        if (ServiceFactory.getInstance().getUserService().isLogin()) {
            ARouter.getInstance().build("/message/list").navigation();
        } else {
            Toast.makeText(this, "请先登录", Toast.LENGTH_SHORT).show();
        }
    }

    public void toUserInfo(View view) {
        if (ServiceFactory.getInstance().getUserService().isLogin()) {
            ARouter.getInstance().build("/user/info").navigation();
        } else {
            Toast.makeText(this, "请先登录", Toast.LENGTH_SHORT).show();
        }
    }
}
