package com.lifegame;

import com.example.startproject.R.string;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewGameActivity extends Activity implements OnClickListener {
	TextView checkedTextView1;
	Button okButton;
	EditText PlayerNameEditText;

 

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_game_layout);
        init();
        checkedTextView1 = (TextView) findViewById(R.id.checkedTextView1);
        PlayerNameEditText = (EditText) findViewById(R.id.PlayerNameEditText);
  		
    }  
    
    private void init() {
    	okButton = (Button) findViewById(R.id.okButton);
    	okButton.setOnClickListener(this);
    	
    }
    
    public void charSequence(View v) {
    	
		String st = PlayerNameEditText.getText().toString();
    	checkedTextView1.setText(st);
    	PlayerNameEditText.setText("");
    }
    
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.okButton:
            Intent intent = new Intent(this, Chapter_01.class);
            startActivity(intent);
            break;
        default:
            break;
   }
}
    
}
