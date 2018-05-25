package com.lifegame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

 
public class StartActivity extends Activity implements OnClickListener {
	
	Button newGameButton;
	Button continueButton;
	Button menuButton;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        init();
    }  
    
    private void init() {
    	newGameButton = (Button) findViewById(R.id.newGameButton);
    	newGameButton.setOnClickListener(this);
    	continueButton = (Button) findViewById(R.id.continueButton);
    	continueButton.setOnClickListener(this);
    }
        
    
    	
    	public void onClick(View v) {
            switch (v.getId()) {
            case R.id.newGameButton:
                Intent intent = new Intent(this, NewGameActivity.class);
                startActivity(intent);
                break;
            default:
                break;
       }
  }
}
