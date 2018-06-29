package com.example.pasha.proba_01;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Switch;

import java.util.ArrayList;

public class Proba01Activity extends Activity {

//    private Button button, button1, button2, button3, button4, button5, button6, button7, button8, button9;
//    private int x;
//    private boolean isEnabled;
//
//    // Создаем ArrayList ы который будем записывать числа с кнопок
//    ArrayList<Integer> integerArrayList;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_proba01);
//
//        final ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//
//        final Button button1 = (Button)findViewById(R.id.button1);
//        final Button button2 = (Button)findViewById(R.id.button2);
//        final Button button3 = (Button)findViewById(R.id.button3);
//        final  Button button4 = (Button)findViewById(R.id.button4);
//        final  Button button5 = (Button)findViewById(R.id.button5);
//        final Button button6 = (Button)findViewById(R.id.button6);
//        final Button button7 = (Button)findViewById(R.id.button7);
//        final Button button8 = (Button)findViewById(R.id.button8);
//        final  Button button9 = (Button)findViewById(R.id.button9);
//
//        button1.setEnabled(isEnabled);
//
//        View.OnClickListener onClickListener1 = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                x = 10;
//
//                switch (view.getId()){
//                    case R.id.button5:
//                        button5.setText(Integer.toString(x));
//
//                        String num1Button5 = Integer.toString(x);
//                        int num1 = Integer.parseInt(num1Button5);
//                        num1 = num1 - 2;
//
//                        button4.setText(Integer.toString(num1));
//                        button2.setEnabled(isEnabled);
//                        isEnabled = !isEnabled;
//                        // Записываем num1 в integerArrayList
//                        integerArrayList.add(num1);
//
////                        button2.setText(Integer.toString(integerArrayList.get(0)));
//                        break;
//                }
//
//            }
//        };
//
//        button5.setOnClickListener(onClickListener1);
//
//
//    }

    private Button button, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15;
    private boolean isEnabled;
    private int x;
    RadioGroup buttonGroup;
    ArrayList<Integer> integerArrayList;
    ArrayList<String> stringArrayList;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fild_layout);

            final ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

            final Button button1 = (Button)findViewById(R.id.button1);
            final Button button2 = (Button)findViewById(R.id.button2);
            final Button button3 = (Button)findViewById(R.id.button3);
            Button button4 = (Button)findViewById(R.id.button4);
            Button button5 = (Button)findViewById(R.id.button5);
            final Button button6 = (Button)findViewById(R.id.button6);
            final Button button7 = (Button)findViewById(R.id.button7);
            Button button8 = (Button)findViewById(R.id.button8);
            Button button9 = (Button)findViewById(R.id.button9);
            Button button10 = (Button)findViewById(R.id.button10);
            Button button11= (Button)findViewById(R.id.button11);
            Button button12 = (Button)findViewById(R.id.button12);
            Button button13= (Button)findViewById(R.id.button13);
            Button button14 = (Button)findViewById(R.id.button14);
            Button button15 = (Button)findViewById(R.id.button15);

//            button2.setEnabled(isEnabled);
//            button3.setEnabled(isEnabled);
//            button4.setEnabled(isEnabled);
//            button5.setEnabled(isEnabled);
//            button6.setEnabled(isEnabled);
//            button7.setEnabled(isEnabled);
//            button8.setEnabled(isEnabled);
//            button9.setEnabled(isEnabled);
//            button10.setEnabled(isEnabled);
//            button11.setEnabled(isEnabled);
//            button12.setEnabled(isEnabled);
//            button13.setEnabled(isEnabled);
//            button14.setEnabled(isEnabled);
//            button15.setEnabled(isEnabled);

            button1.setText(Integer.toString(x + 10));

            View.OnClickListener onClickListener1 = new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        switch (view.getId()) {
                            case R.id.button1:
                                x = integerArrayList.get(0);


                                    button1.setText(Integer.toString((x + 10) - 1));
                                    button2.setText(Integer.toString(x + 1));
                                    button6.setText(Integer.toString(x + 1));

                                    String sB1 = Integer.toString((x + 10) - 1);
                                    int iB1 = Integer.parseInt(sB1);

                                    String sB2 = Integer.toString(x);
                                    int iB2 = Integer.parseInt(sB2);

                                    String sB6 = Integer.toString(x + 1);
                                    int iB6 = Integer.parseInt(sB6);

                                    integerArrayList.add(iB1);
                                    integerArrayList.add(iB2);
                                    integerArrayList.add(iB6);

//                                    button1.setEms((x + 10) - 1);
//                                    button1.setVisibility(x + x);
//                                    button1.setFocusable(isEnabled);
                                 break;






                            case R.id.button2:
                                int x = integerArrayList.get(1);
                                if (x == 0) {
                                    // Если мы сейчас нажимаем на кнопку button2, значение которой составляет 1 - то срабатывает x-1, то есть теперь ее значение 0 и она становится неативной
                                    button2.setVisibility(x - 1);
                                }


                                // Кнопке, на которую мы нажали прсваиваеим значение x - 1, в данном случаи это - 0
                                button2.setText(Integer.toString(x - 1));
                                // Присваиваем значение x + 1 всем соседним кнопкам, в данном случаи это для button1 = 10, для (button3 и button7) = 1
                                button1.setText(Integer.toString(integerArrayList.get(0) + 1));
                                button3.setText(Integer.toString(x + 1));
                                button7.setText(Integer.toString(x + 1));

                                // Перезаписываем значение ячейки integerArrayList.get(0) нашей колекции
                                String sB1_01 = Integer.toString(integerArrayList.get(0) + 1);
                                int iB1_01 = Integer.parseInt(sB1_01);
                                integerArrayList.set(0, iB1_01);

                                break;
                        }

                    }
            };


            button1.setOnClickListener(onClickListener1);
            button2.setOnClickListener(onClickListener1);
            button3.setOnClickListener(onClickListener1);
            button4.setOnClickListener(onClickListener1);
            button5.setOnClickListener(onClickListener1);
            button6.setOnClickListener(onClickListener1);
            button7.setOnClickListener(onClickListener1);
            button8.setOnClickListener(onClickListener1);
            button9.setOnClickListener(onClickListener1);
            button10.setOnClickListener(onClickListener1);
            button11.setOnClickListener(onClickListener1);
            button12.setOnClickListener(onClickListener1);
            button13.setOnClickListener(onClickListener1);
            button14.setOnClickListener(onClickListener1);
            button15.setOnClickListener(onClickListener1);


        }

}
