package com.lifegame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Chapter_01_Activity extends Activity {

	TextView textViewName;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.chapter_01);
        
        textViewName = (TextView) findViewById(R.id.textViewName);
        Intent intent = getIntent();
        
        String message = intent.getStringExtra("message");
        textViewName.setText(message);
        
    }
}
