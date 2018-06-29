package com.example.pasha.proba_01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Proba01Activity extends Activity implements View.OnClickListener{

    private Button[][] buttons = new Button[5][5];

    private boolean plater1Turn = true;

    private int number10;

    private TextView textViewPlayer1;
    private TextView textViewPlayer2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proba01);

        textViewPlayer1 = findViewById(R.id.text_view_record);
        textViewPlayer2 = findViewById(R.id.text_view_score);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5;j++){
                String buttonID = "button_" + i + j;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                buttons[i][j] = findViewById(resID);
                buttons[i][j].setOnClickListener(this);

            }
        }

        Button buttonReset = (Button)findViewById(R.id.button_reset);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

    }


    @Override
    public void onClick(View v) {


        



    }
}










