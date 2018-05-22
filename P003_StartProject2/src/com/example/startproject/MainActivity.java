package com.example.startproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

    Button startButton;
    Button preferencesButton;
    Button aboutButton;
    Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(this);

        preferencesButton = (Button) findViewById(R.id.preferencesButton);
        preferencesButton.setOnClickListener(this);

        aboutButton = (Button) findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.startButton:
            Intent intent = new Intent(this, StartActivity.class);
            startActivity(intent);
            break;
        case R.id.preferencesButton:
            Intent intent2 = new Intent(this, PreferencesActivity.class);
            startActivity(intent2);
            break;
        case R.id.aboutButton:
            Intent intent3 = new Intent(this, AboutActivity.class);
            startActivity(intent3);
            break;
        default:
            break;
        }

    }
}
