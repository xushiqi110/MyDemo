package com.bw.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ThreeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_three);
        System.out.println("ThreeActivity===onCreate1");
    }
    @Override
    protected void onStart() {
    	super.onStart();
    	System.out.println("TowActivity===onStart2");
    }
    @Override
    protected void onResume() {
    	super.onResume();
    	System.out.println("TowActivity===onResume3");
    }
    @Override
    protected void onPause() {
    	super.onPause();
    	System.out.println("TowActivity===onPause4");
    }
    @Override
    protected void onStop() {
    	super.onStop();
    	System.out.println("TowActivity===onStop5");
    }
    @Override
    protected void onRestart() {
    	super.onRestart();
    	System.out.println("TowActivity===onRestart6");
    }
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	System.out.println("TowActivity===onDestroy7");
    }
}
