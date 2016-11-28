package com.bw.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FourActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_four);
        System.out.println("FourActivity===onCreate1");
    }
    @Override
    protected void onStart() {
    	super.onStart();
    	System.out.println("FourActivity===onStart2");
    }
    @Override
    protected void onResume() {
    	super.onResume();
    	System.out.println("FourActivity===onResume3");
    }
    @Override
    protected void onPause() {
    	super.onPause();
    	System.out.println("FourActivity===onPause4");
    }
    @Override
    protected void onStop() {
    	super.onStop();
    	System.out.println("FourActivity===onStop5");
    }
    @Override
    protected void onRestart() {
    	super.onRestart();
    	System.out.println("FourActivity===onRestart6");
    }
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	System.out.println("FourActivity===onDestroy7");
    }
}
