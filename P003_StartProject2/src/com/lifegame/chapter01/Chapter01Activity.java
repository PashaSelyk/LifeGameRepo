package com.lifegame.chapter01;

import java.util.ArrayList;
import java.util.Scanner;

import com.lifegame.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Chapter01Activity extends Activity implements OnClickListener {

	TextView tv_text, textViewName;
	Button b_read;
	
	ArrayList<String> dataC = new ArrayList<String>();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.chapter_01);
        flat();
//        scan();
//        readingText();
    }
    
    

	@Override
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.b_read:
            Intent intent = new Intent(this, Chapter01sheet01Activity.class);
            startActivity(intent);
//            exit();
            break;
        default:
            break;
        }
    }
	
	public void flat() {
		 textViewName = (TextView) findViewById(R.id.textViewName);
	        Intent intent = getIntent();
	        
	        String message = intent.getStringExtra("message");
	        textViewName.setText(message);
	        
	        b_read = (Button)findViewById(R.id.b_read);
	        b_read.setOnClickListener(this);
	 
	}
	


}
