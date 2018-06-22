package com.example.pasha.cubgameregeneration;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.graphics.Color.GREEN;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout RelativeLay1, RelativeLay2, RelativeLay3, RelativeLay4, RelativeLay6, RelativeLay7, RelativeLay8, RelativeLay9;
    private Button button;
    private TextView textView;
    private int i= 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.layout);

        }


    public void onClickBut(View v) {
        Button button = (Button) findViewById(R.id.button);
        RelativeLayout RelativeLay2 = (RelativeLayout) findViewById(R.id.RelativeLay2);
        RelativeLayout RelativeLay8 = (RelativeLayout) findViewById(R.id.RelativeLay8);

        RelativeLayout RelativeLay4 = (RelativeLayout) findViewById(R.id.RelativeLay4);

        button.setBackgroundColor(Color.GREEN);

        RelativeLayout.LayoutParams lParms1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);


        Button btnNew2 = new Button(this);
        Button btnNew8 = new Button(this);

        RelativeLay2.addView(btnNew2, lParms1);
        RelativeLay8.addView(btnNew8, lParms1);

        btnNew2.setId(btnNew2.generateViewId());
        btnNew8.setId(btnNew8.generateViewId());

        btnNew2 = (Button) findViewById(btnNew2.getId());
        btnNew8 = (Button) findViewById(btnNew8.getId());

        final Button finalBtnNew2 = btnNew2;
        final Button finalBtnNew8 = btnNew8;


        btnNew2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finalBtnNew2.setBackgroundColor(GREEN);

                        RelativeLayout RelativeLay1 = (RelativeLayout) findViewById(R.id.RelativeLay1);
                        RelativeLayout RelativeLay3 = (RelativeLayout) findViewById(R.id.RelativeLay3);

                        RelativeLayout.LayoutParams lParms1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                        Button btnNew1 = new Button(MainActivity.this);
                        Button btnNew3 = new Button(MainActivity.this);

                        RelativeLay9.addView(btnNew1, lParms1);
                        RelativeLay7.addView(btnNew3, lParms1);

                        btnNew1.setId(btnNew1.generateViewId());
                        btnNew3.setId(btnNew3.generateViewId());

                        btnNew1 = (Button) findViewById(btnNew1.getId());
                        btnNew3 = (Button) findViewById(btnNew3.getId());

                        final Button finalBtnNew1 = btnNew1;
                        final Button finalBtnNew3 = btnNew3;

                        btnNew1.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        finalBtnNew1.setBackgroundColor(GREEN);
                                    }
                                }
                        );

                        btnNew3.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        finalBtnNew3.setBackgroundColor(GREEN);
                                    }
                                }
                        );

                    }
                }
        );

        btnNew8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finalBtnNew8.setBackgroundColor(GREEN);

                        RelativeLayout RelativeLay9 = (RelativeLayout) findViewById(R.id.RelativeLay9);
                        RelativeLayout RelativeLay7 = (RelativeLayout) findViewById(R.id.RelativeLay7);

                        RelativeLayout.LayoutParams lParms1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                        Button btnNew9 = new Button(MainActivity.this);
                        Button btnNew7 = new Button(MainActivity.this);

                        RelativeLay9.addView(btnNew9, lParms1);
                        RelativeLay7.addView(btnNew7, lParms1);

                        btnNew9.setId(btnNew9.generateViewId());
                        btnNew7.setId(btnNew7.generateViewId());

                        btnNew9 = (Button) findViewById(btnNew9.getId());
                        btnNew7 = (Button) findViewById(btnNew7.getId());

                        final Button finalBtnNew9 = btnNew9;
                        final Button finalBtnNew7 = btnNew7;

                        btnNew9.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        finalBtnNew9.setBackgroundColor(GREEN);

                                      finalBtnNew9.setText(" 9 ");

                                    }
                                }
                        );

                        btnNew7.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        finalBtnNew7.setBackgroundColor(GREEN);
                                    }
                                }
                        );

                    }
                }
        );


    }

//    private void rst(View view) {
//
//        RelativeLayout  RelativeLay9 = (RelativeLayout)findViewById(R.id.RelativeLay9);
//
//            RelativeLayout.LayoutParams lParms1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//                 Button btnNew9 = new Button(this);
//                    RelativeLay9.addView(btnNew9, lParms1);
//                btnNew9.setId(btnNew9.generateViewId());
//            btnNew9 = (Button)findViewById(btnNew9.getId());
//        final Button finalBtnNew9 = btnNew9;
//
//
//        btnNew9.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {

//                        finalBtnNew9.setBackgroundColor(RED);
//                    }
//                }
//        );
//    }


    // нужно создать метод, который при нажатии кнопки будет добавлять на экран новые кнопки рядом с существующей


    // нужно сделать цикл, который будет создавать новую кнопку при нажатии на существуюзею.
// Также он должен присваивать id ковой кнопке и делать ее активной.

}
