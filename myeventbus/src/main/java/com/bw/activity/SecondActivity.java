package com.bw.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.bw.base.FirstEvent;

import de.greenrobot.event.EventBus;


/**
 * autour: 徐仕奇
 * action：类的作用:发送消息
 * date: 2016/12/12 0012 下午 5:00
 * update: 2016/12/12 0012
 */
public class SecondActivity extends AppCompatActivity {
    /**
     * 4、发送消息
     * 发送消息是使用EventBus中的Post方法来实现发送的，
     * 发送过去的是我们新建的类的实例！
     */
    private Button btn_FirstEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn_FirstEvent = (Button) findViewById(R.id.btn_first_event);

        btn_FirstEvent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(
                        new FirstEvent("FirstEvent btn clicked"));
            }
        });
    }

}
