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
 * Fragment��activity�д�ֵ��ͨ���ӿڻص���
 * ������
 * 2016��11��29
 * @author Administrator
 *
 */
public class MyFragmentThree extends Fragment implements View.OnClickListener {
	
    /**
     * �������ⲿactivity������
     */
    private FragmentInteraction mlistterner;
    
    /**
     * ����������activity����ʵ�ֵĽӿ�
     */
    public interface FragmentInteraction
    {
        /**
         * Fragment ��Activity����ָ�����������Ը�������������
         * @param str
         */
        void process(String str);
    }
    
    @Override
    public void onClick(View v) {
    	mlistterner.process("���ǵ��Ӿ�");
    }
    /**
     * ��FRagmen�����ص�activity��ʱ��ᱻ�ص�
     * @param activity
     */
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		System.out.println("onAttach======="+"Three");
		
		//FragmentInteraction�Ƕ���������activity����ʵ�ֵĽӿ�
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
		//Ϊ�ռ��󶨼���
		textView.setOnClickListener(this);
		return view;
	}
	@Override
	public void onDetach() {
		super.onDetach();
		System.out.println("onDetach======="+"Three");
		//��onDetach�����аѴ��ݽ�����activity�ͷŵ���
        mlistterner = null;
	}
}
