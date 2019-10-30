package com.sjl.message.app;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.sjl.message.R;

import androidx.appcompat.app.AppCompatActivity;
@Route(path="/message/list")
public class MessageListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_list);
    }
}
