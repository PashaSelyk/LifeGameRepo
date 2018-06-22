package com.example.pasha.cubgameregeneration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
    }




    public void onClickBut2(View view){

        RelativeLayout RelativeLay3 = (RelativeLayout)findViewById(R.id.RelativeLay3);

        RelativeLayout.LayoutParams lParms1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);



        Button btnNew3 = new Button(this);
        RelativeLay3.addView(btnNew3, lParms1);
        btnNew3.setId(btnNew3.generateViewId());
        btnNew3 = (Button)findViewById(btnNew3.getId());
        final Button finalBtnNew3 = btnNew3;

    }
}
