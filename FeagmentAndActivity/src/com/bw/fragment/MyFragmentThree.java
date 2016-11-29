package com.bw.fragment;

import com.bw.activity.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * Fragment向activity中传值（通过接口回掉）
 * 徐仕奇
 * 2016、11、29
 * @author Administrator
 *
 */
public class MyFragmentThree extends Fragment implements View.OnClickListener {
	
    /**
     * 用来与外部activity交互的
     */
    private FragmentInteraction mlistterner;
    
    /**
     * 定义了所有activity必须实现的接口
     */
    public interface FragmentInteraction
    {
        /**
         * Fragment 向Activity传递指令，这个方法可以根据需求来定义
         * @param str
         */
        void process(String str);
    }
    
    @Override
    public void onClick(View v) {
    	mlistterner.process("我是电视剧");
    }
    /**
     * 当FRagmen被加载到activity的时候会被回调
     * @param activity
     */
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		System.out.println("onAttach======="+"Three");
		
		//FragmentInteraction是定义了所有activity必须实现的接口
        if(activity instanceof FragmentInteraction){
            mlistterner = (FragmentInteraction)activity;
        }else{
            throw new IllegalArgumentException("activity must implements FragmentInteraction");
        }
        
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		System.out.println("onCreateView======="+"Three");
		View view=inflater.inflate(R.layout.item_one, container,false);
		TextView textView=(TextView) view.findViewById(R.id.tv1);
		//为空件绑定监听
		textView.setOnClickListener(this);
		return view;
	}
	@Override
	public void onDetach() {
		super.onDetach();
		System.out.println("onDetach======="+"Three");
		//在onDetach方法中把传递进来的activity释放掉。
        mlistterner = null;
	}
}
