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
 * activity向Fragment中传值(通过bundle)
 * 徐仕奇
 * 2016、11、29
 * @author Administrator
 *
 */
public class MyFragmentFour extends Fragment{


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		System.out.println("onCreateView======="+"Four");
		View view=inflater.inflate(R.layout.item_one, container,false);
		//取出bundle中的值
		Bundle bundle=getArguments();
		String hua=bundle.getString("DATA");
		TextView textView=(TextView) view.findViewById(R.id.tv1);
		textView.setText(hua);
		return view;
	}
}
