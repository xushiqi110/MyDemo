package com.bw.fragment;

import com.bw.activity.MainActivity;
import com.bw.activity.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * 打印activity的生命周期，
 * 用于验证activity和fragment生命周期的关系，
 * fragment和fragment之间的调用
 * 徐仕奇
 * 2016、11、29
 *
 */
public class MyFragmentTwo extends Fragment {
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		System.out.println("onAttach======="+"Two");
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		System.out.println("onCreate======="+"Two");
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		System.out.println("onCreateView======="+"Two");
		return null;
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		System.out.println("onActivityCreated======="+"Two");
	}
	@Override
	public void onStart() {
		super.onStart();
		System.out.println("onStart======="+"Two");
	}
	@Override
	public void onResume() {
		super.onResume();
		System.out.println("onResume======="+"Two");
	}
	@Override
	public void onPause() {
		super.onPause();
		System.out.println("onPause======="+"Two");
	}
	@Override
	public void onStop() {
		super.onStop();
		System.out.println("onStop======="+"Two");
	}
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		System.out.println("onDestroyView======="+"Two");
	}
	@Override
	public void onDestroy() {
		super.onDestroy();
		System.out.println("onDestroy======="+"Two");
	}
	@Override
	public void onDetach() {
		super.onDetach();
		System.out.println("onDetach======="+"Two");
	}
}
