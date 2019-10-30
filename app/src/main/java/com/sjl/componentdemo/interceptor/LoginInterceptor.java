package com.sjl.componentdemo.interceptor;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.sjl.componentbase.ServiceFactory;

/**
 * LoginInterceptor
 *
 * @author 沈建林
 * @date 2019/10/30
 */
@Interceptor(priority = 8, name = "登录拦截器")
public class LoginInterceptor implements IInterceptor {
    private Context context;

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        if (postcard.getPath().equalsIgnoreCase("/user/info")) {
            if (ServiceFactory.getInstance().getUserService().isLogin()) {
                callback.onContinue(postcard);
            } else {
                Toast.makeText(context, "未登录", Toast.LENGTH_SHORT).show();
                callback.onInterrupt(new RuntimeException("未登录"));
            }
        } else {
            callback.onContinue(postcard);
        }
    }

    @Override
    public void init(Context context) {
        this.context = context;
    }
}
