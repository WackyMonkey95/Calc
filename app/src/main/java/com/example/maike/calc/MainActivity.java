package com.example.maike.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

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
        TextView resultView = (TextView)findViewById(R.id.resultView);

        one_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        two_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        three_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        four_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        five_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        six_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        seven_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        eight_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        nine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        zero_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
}
//first commit