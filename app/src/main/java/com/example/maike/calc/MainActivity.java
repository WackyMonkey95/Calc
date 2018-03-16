package com.example.maike.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    String runningNumber = "";
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one_btn = (Button)findViewById(R.id.one_btn);
        Button two_btn = (Button)findViewById(R.id.two_btn);
        Button three_btn = (Button)findViewById(R.id.three_btn);
        Button four_btn = (Button)findViewById(R.id.four_btn);
        Button five_btn = (Button)findViewById(R.id.five_btn);
        Button six_btn = (Button)findViewById(R.id.six_btn);
        Button seven_btn = (Button)findViewById(R.id.seven_btn);
        Button eight_btn = (Button)findViewById(R.id.eight_btn);
        Button nine_btn = (Button)findViewById(R.id.nine_btn);
        Button zero_btn = (Button)findViewById(R.id.zero_btn);

        ImageButton equal_btn = (ImageButton)findViewById(R.id.equal_btn);
        ImageButton divide_btn = (ImageButton)findViewById(R.id.divide_btn);
        ImageButton substract_btn = (ImageButton)findViewById(R.id.subtract_btn);
        ImageButton multiply_btn = (ImageButton)findViewById(R.id.multiply_btn);
        ImageButton add_btn = (ImageButton)findViewById(R.id.add_btn);

        Button clear_btn = (Button)findViewById(R.id.clear_btn);

        resultView = (TextView)findViewById(R.id.resultView);


        resultView.setText("");

        one_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(1);
            }
        });

        two_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(2);
            }
        });

        three_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(3);
            }
        });

        four_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(4);
            }
        });

        five_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(5);
            }
        });

        six_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(6);
            }
        });

        seven_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(7);
            }
        });

        eight_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(8);
            }
        });

        nine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(9);
            }
        });

        zero_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(0);
            }
        });

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        substract_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        clear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
    void numberPressed(int number){
        runningNumber += String.valueOf(number);
        resultView.setText(runningNumber);


    }
}
//first commit