package com.lifegame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewGameActivity extends Activity implements OnClickListener {
	
	TextView textViewName;
	Button okButton;
	EditText PlayerNameEditText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.new_game_layout);
        
        
        
        
        
        
       
        textViewName = (EditText) findViewById(R.id.textViewName);
        PlayerNameEditText = (EditText) findViewById(R.id.PlayerNameEditText);

    	okButton = (Button) findViewById(R.id.okButton);
    	okButton.setOnClickListener(this);
    	
    	
    	
    	
    }
        
    
    
    
   
    public void onClick(View v) {
	    Intent intent = new Intent(this, Chapter_01_Activity.class); 
	    intent.putExtra("message", PlayerNameEditText.getText().toString());
	    startActivity(intent);
	  } 
    
}
 