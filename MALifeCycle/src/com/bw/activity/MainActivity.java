package com.bw.activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("MainActivity===onCreate1");
        findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,MainActivity.class));
			}
		});
        findViewById(R.id.button2).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,TowActivity.class));
			}
		});
        findViewById(R.id.button3).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,ThreeActivity.class));
			}
		});
        findViewById(R.id.button4).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,FourActivity.class));
			}
		});
    }
    @Override
    protected void onStart() {
    	super.onStart();
    	System.out.println("MainActivity===onStart2");
    }
    @Override
    protected void onResume() {
    	super.onResume();
    	System.out.println("MainActivity===onResume3");
    }
    @Override
    protected void onPause() {
    	super.onPause();
    	System.out.println("MainActivity===onPause4");
    }
    @Override
    protected void onStop() {
    	super.onStop();
    	System.out.println("MainActivity===onStop5");
    }
    @Override
    protected void onRestart() {
    	super.onRestart();
    	System.out.println("MainActivity===onRestart6");
    }
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	System.out.println("MainActivity===onDestroy7");
    }
}
