package com.bw.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * 打印activity的生命周期，
 * 用于验证activity和fragment生命周期的关系，
 * fragment和fragment之间的调用
 * 徐仕奇
 * 2016、11、29
 *
 */
public class MyFragmentOne extends Fragment{

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		System.out.println("onAttach======="+"One");
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		System.out.println("onCreate======="+"One");
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		System.out.println("onCreateView======="+"One");
		return null;
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		System.out.println("onActivityCreated======="+"One");
	}
	@Override
	public void onStart() {
		super.onStart();
		System.out.println("onStart======="+"One");
	}
	@Override
	public void onResume() {
		super.onResume();
		System.out.println("onResume======="+"One");
	}
	@Override
	public void onPause() {
		super.onPause();
		System.out.println("onPause======="+"One");
	}
	@Override
	public void onStop() {
		super.onStop();
		System.out.println("onStop======="+"One");
	}
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		System.out.println("onDestroyView======="+"One");
	}
	@Override
	public void onDestroy() {
		super.onDestroy();
		System.out.println("onDestroy======="+"One");
	}
	@Override
	public void onDetach() {
		super.onDetach();
		System.out.println("onDetach======="+"One");
	}
}
