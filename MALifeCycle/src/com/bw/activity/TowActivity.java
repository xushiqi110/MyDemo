package com.bw.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tow);
        System.out.println("TowActivity===onCreate1");
    }
    @Override
    protected void onStart() {
    	super.onStart();
    	System.out.println("ThreeActivity===onStart2");
    }
    @Override
    protected void onResume() {
    	super.onResume();
    	System.out.println("ThreeActivity===onResume3");
    }
    @Override
    protected void onPause() {
    	super.onPause();
    	System.out.println("ThreeActivity===onPause4");
    }
    @Override
    protected void onStop() {
    	super.onStop();
    	System.out.println("ThreeActivity===onStop5");
    }
    @Override
    protected void onRestart() {
    	super.onRestart();
    	System.out.println("ThreeActivity===onRestart6");
    }
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	System.out.println("ThreeActivity===onDestroy7");
    }
}
