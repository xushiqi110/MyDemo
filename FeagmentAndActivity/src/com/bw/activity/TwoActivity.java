package com.bw.activity;

import com.bw.fragment.MyFragmentFive;
import com.bw.fragment.MyFragmentFour;
import com.bw.fragment.MyFragmentThree;
import com.bw.fragment.MyFragmentThree.FragmentInteraction;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class TwoActivity extends FragmentActivity implements FragmentInteraction{

	
	FragmentManager manager;
	FragmentTransaction transaction;
	Fragment fragment;
	private MyFragmentThree mft;
	private MyFragmentFour mff;
	private MyFragmentFive mfv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		mft=new MyFragmentThree();
		mff=new MyFragmentFour();
		mfv=new MyFragmentFive();
        manager=getSupportFragmentManager();
      if (fragment==null) {
      	//开启事务
      	transaction=manager.beginTransaction();
      	transaction.add(R.id.frametwo, mft, "Tabthree").commit();
		};
        findViewById(R.id.b1two).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//开启事务
	        	transaction=manager.beginTransaction();
	        	transaction.replace(R.id.frametwo, mft, "Tabthree").commit();
			}
		});
        findViewById(R.id.b2two).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//开启事务
	        	transaction=manager.beginTransaction();
	        	transaction.replace(R.id.frametwo, mff, "Tabfour").commit();
			}
		});
        findViewById(R.id.b3two).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
        	//开启事务
        	transaction=manager.beginTransaction();
        	transaction.replace(R.id.frametwo, mfv, "Tabfive").commit();
			}
		});
        //方法一：MyFragmentOne和activity之间的数据传值
        FAByValue();
	}
    /**
     * 方法一：MyFragmentOne和activity之间的数据传值
     */
    public void FAByValue(){
    	/**
    	 * 刚开始报了空指针的报错，是因为我在替换（replace）的时候在参数里new了一个实例
    	 * 而在传值的时候又new了一个实例，一共是两个实例，一个实例传值，一个实例取值，对不
    	 * 到一起，所以要用一个共同的实例，存取值就没问题了
    	 */
//    	MyFragmentOne myFragment = new MyFragmentOne();
        Bundle bundle = new Bundle();
        bundle.putString("DATA","你好item1,我是主activity,我向你传值了");//这里的values就是我们要传的值
        mff.setArguments(bundle);
    }
    /**
     * 方法二：MyFragmentOne和activity之间的数据传值
     * 宿主activity中的getTitles()方法
     */
	public String getTitles(){
	    return "你好item1,我是主activity,我又向你传值了";
	}
	@Override
	public void process(String str) {
		Toast.makeText(TwoActivity.this, str, 0).show();
	}
}
