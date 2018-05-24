package com.lifegame;

import java.util.Locale;

import com.lifegame.animation.MyBounceInterpolator;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
    
    public static final String DEFAULT_LOCALE = "ru";

    Button startButton;
    Button preferencesButton;
    Button aboutButton;
    Button exitButton;
    ViewGroup startContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLocale(DEFAULT_LOCALE);
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
        init();
        animateButtons();
    }
    
    private void init() {
        startContainer = (ViewGroup) findViewById(R.id.start_container);
        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(this);
        preferencesButton = (Button) findViewById(R.id.preferencesButton);
        preferencesButton.setOnClickListener(this);
        aboutButton = (Button) findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(this);
        exitButton = (Button) findViewById(R.id.exitButton);
        exitButton.setOnClickListener(this);
    }
    
    public void animateButtons() {
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.3, 20);
        myAnim.setInterpolator(interpolator);
        startButton.startAnimation(myAnim);
        preferencesButton.startAnimation(myAnim);
        aboutButton.startAnimation(myAnim);
        exitButton.startAnimation(myAnim);
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
        case R.id.exitButton:
            exit();
            break;
        default:
            break;
        }
    }
    
    public void exit() {
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory(Intent.CATEGORY_HOME);
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  
        startActivity(homeIntent);
    }
    
    private void setLocale(String localeStr) {
        Locale locale = new Locale(localeStr);
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
              getBaseContext().getResources().getDisplayMetrics());
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        setLocale(DEFAULT_LOCALE);
        animateButtons();
    }
}
