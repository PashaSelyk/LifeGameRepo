package com.example.startproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(this);
		
		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(this);

		
	}
	
	  @Override
	  public void onClick(View v) {
	    switch (v.getId()) {
	    case R.id.button1:
	    
	    	Intent intent = new Intent(this, Activity2.class);
	    	startActivity(intent);

	      break;
      
	      case R.id.button2:
	    	  
	        	Intent intent2 = new Intent(this, PREFEREBNCES.class);
	        	startActivity(intent2);
	          break;
		    default:
			      break;
	    }

	  
	  

	
	


			
		
	
	}
}
