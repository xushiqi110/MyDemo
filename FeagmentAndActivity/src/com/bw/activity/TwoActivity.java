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
      	//��������
      	transaction=manager.beginTransaction();
      	transaction.add(R.id.frametwo, mft, "Tabthree").commit();
		};
        findViewById(R.id.b1two).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//��������
	        	transaction=manager.beginTransaction();
	        	transaction.replace(R.id.frametwo, mft, "Tabthree").commit();
			}
		});
        findViewById(R.id.b2two).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//��������
	        	transaction=manager.beginTransaction();
	        	transaction.replace(R.id.frametwo, mff, "Tabfour").commit();
			}
		});
        findViewById(R.id.b3two).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
        	//��������
        	transaction=manager.beginTransaction();
        	transaction.replace(R.id.frametwo, mfv, "Tabfive").commit();
			}
		});
        //����һ��MyFragmentOne��activity֮������ݴ�ֵ
        FAByValue();
	}
    /**
     * ����һ��MyFragmentOne��activity֮������ݴ�ֵ
     */
    public void FAByValue(){
    	/**
    	 * �տ�ʼ���˿�ָ��ı�������Ϊ�����滻��replace����ʱ���ڲ�����new��һ��ʵ��
    	 * ���ڴ�ֵ��ʱ����new��һ��ʵ����һ��������ʵ����һ��ʵ����ֵ��һ��ʵ��ȡֵ���Բ�
    	 * ��һ������Ҫ��һ����ͬ��ʵ������ȡֵ��û������
    	 */
//    	MyFragmentOne myFragment = new MyFragmentOne();
        Bundle bundle = new Bundle();
        bundle.putString("DATA","���item1,������activity,�����㴫ֵ��");//�����values��������Ҫ����ֵ
        mff.setArguments(bundle);
    }
    /**
     * ��������MyFragmentOne��activity֮������ݴ�ֵ
     * ����activity�е�getTitles()����
     */
	public String getTitles(){
	    return "���item1,������activity,�������㴫ֵ��";
	}
	@Override
	public void process(String str) {
		Toast.makeText(TwoActivity.this, str, 0).show();
	}
}
