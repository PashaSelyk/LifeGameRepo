package com.example.pasha.cubgameregeneration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MenuActivity extends AppCompatActivity  implements View.OnClickListener{

    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        start = (Button)findViewById(R.id.startButton);
        start.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.startButton:
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            break;
            default:
            break;
        }

    }
}
