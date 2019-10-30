package com.sjl.user.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.sjl.user.R;
import com.sjl.user.UserUtil;

@Route(path = "/user/info")
public class UserInfoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        ((TextView) findViewById(R.id.tv_info)).setText(UserUtil.userInfo.toString());
    }
}
