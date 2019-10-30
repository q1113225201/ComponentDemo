package com.sjl.componentdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.sjl.componentbase.ServiceFactory;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        ARouter.getInstance().build("/user/login").navigation();
    }

    public void toMessage(View view) {
        if(ServiceFactory.getInstance().getUserService().isLogin()) {
            ARouter.getInstance().build("/message/list").navigation();
        }else{
            Toast.makeText(this, "请先登录", Toast.LENGTH_SHORT).show();
        }
    }

    public void toUserInfo(View view) {
        ARouter.getInstance().build("/user/info").navigation();
    }
}
