package com.bw.fragment;

import com.bw.activity.R;
import com.bw.activity.TwoActivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * activity��Fragment�д�ֵ(ͨ������activity�еķ���)
 * ������
 * 2016��11��29
 *
 */
public class MyFragmentFive extends Fragment {
	String titles;
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	      //ͨ��ǿת������activity���Ϳ��Ի�ȡ�����ݹ���������
		TwoActivity activity2=(TwoActivity) activity;
		titles=activity2.getTitles();
		System.out.println("onAttach======="+"Five");
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		System.out.println("onCreateView======="+"Five");
		View view=inflater.inflate(R.layout.item_two, container,false);
		TextView textView=(TextView) view.findViewById(R.id.tv2);
		textView.setText(titles);
		return view;
	}
}
