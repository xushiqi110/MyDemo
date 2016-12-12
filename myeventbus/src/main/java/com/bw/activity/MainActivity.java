package com.bw.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.bw.base.FirstEvent;

import de.greenrobot.event.EventBus;
import de.greenrobot.event.Subscribe;


/**
 * autour: 徐仕奇
 * action：类的作用:接收消息的页面注册EventBus：
 * date: 2016/12/12 0012 下午 4:56
 * update: 2016/12/12 0012
 */
public class MainActivity extends AppCompatActivity {
    /**
     * 3、在要接收消息的页面注册EventBus：
     *
     * 在上面的GIF图片的演示中，大家也可以看到，
     * 我们是要在MainActivity中接收发过来的消息的，
     * 所以我们在MainActivity中注册消息。
     *
     * 通过我们会在OnCreate()函数中注册EventBus，
     * 在OnDestroy（）函数中反注册。
     * 所以整体的注册与反注册的代码
     */
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //注册EventBus
        EventBus.getDefault().register(this);
//        EventBus.getDefault().register(MainActivity.this);
        btn = (Button) findViewById(R.id.btn_try);
        tv = (TextView)findViewById(R.id.tv);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * @Subscribe 需要手敲
     * @param event
     */
    @Subscribe
    public void onEventMainThread(FirstEvent event) {

        String msg = "onEventMainThread收到了消息：" + event.getMsg();
        Log.d("harvic", msg);
        tv.setText(msg);
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        EventBus.getDefault().unregister(this);//反注册EventBus
    }
}
