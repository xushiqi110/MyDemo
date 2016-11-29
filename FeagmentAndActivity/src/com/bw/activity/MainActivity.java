package com.bw.activity;

import com.bw.fragment.MyFragmentOne;
import com.bw.fragment.MyFragmentTwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends FragmentActivity{

	FragmentManager manager;
	FragmentTransaction transaction;
	Fragment fragment;
	private MyFragmentOne mfo;
	private MyFragmentTwo mft;
	Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Activity===onCreate1");
        FrameLayout layout=(FrameLayout) findViewById(R.id.frame);
        mfo=new MyFragmentOne();
        mft=new MyFragmentTwo();
        //碎片管理器
        manager=getSupportFragmentManager();
//        fragment=manager.findFragmentByTag("TabOne");
        if (fragment==null) {
        	//开启事务
        	transaction=manager.beginTransaction();
        	transaction.add(R.id.frame, mfo, "TabOne").commit();
		};
		button1=(Button) findViewById(R.id.b1);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//开启事务
	        	transaction=manager.beginTransaction();
	        	transaction.replace(R.id.frame, mfo, "TabOne").commit();

			}
		});
        findViewById(R.id.b2).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//开启事务
	        	transaction=manager.beginTransaction();
	        	transaction.replace(R.id.frame, mft, "TabTow").commit();
			}
		});
        findViewById(R.id.b3).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,TwoActivity.class));
			}
		});
    }

    @Override
    protected void onStart() {
    	super.onStart();
    	System.out.println("Activity===onStart2");
    }
    @Override
    protected void onResume() {
    	super.onResume();
    	System.out.println("Activity===onResume3");
    }
    @Override
    protected void onPause() {
    	super.onPause();
    	System.out.println("Activity===onPause4");
    }
    @Override
    protected void onStop() {
    	super.onStop();
    	System.out.println("Activity===onStop5");
    }
    @Override
    protected void onRestart() {
    	super.onRestart();
    	System.out.println("Activity===onRestart6");
    }
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	System.out.println("Activity===onDestroy7");
    }
}
