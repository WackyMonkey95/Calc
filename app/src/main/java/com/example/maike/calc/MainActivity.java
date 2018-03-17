package com.example.maike.calc;

import android.app.Activity;
import android.media.VolumeShaper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    TextView resultView;

    public enum Operation{
        ADD, SUBTRACT, DIVIDE, MULTIPLY,EQUAL
    }

    String runningNumber = "";
    String leftValueStr = "";
    String rightValueStr = "";
    Operation currentOperation;
    int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // (Button)findViewById(R.id.one_btn)
        // (Button) <-- niet meer nodig in Android Studio 3+

        Button one_btn = findViewById(R.id.one_btn);
        Button two_btn = findViewById(R.id.two_btn);

        // andere manier, maar niet perse beter
        findViewById(R.id.three_btn).setOnClickListener(this);

        Button four_btn = findViewById(R.id.four_btn);
        Button five_btn = findViewById(R.id.five_btn);
        Button six_btn = findViewById(R.id.six_btn);
        Button seven_btn = findViewById(R.id.seven_btn);
        Button eight_btn = findViewById(R.id.eight_btn);
        Button nine_btn = findViewById(R.id.nine_btn);
        Button zero_btn = findViewById(R.id.zero_btn);

        ImageButton equal_btn = findViewById(R.id.equal_btn);
        ImageButton divide_btn = findViewById(R.id.divide_btn);
        ImageButton substract_btn = findViewById(R.id.subtract_btn);
        ImageButton multiply_btn = findViewById(R.id.multiply_btn);
        ImageButton add_btn = findViewById(R.id.add_btn);

        Button clear_btn = findViewById(R.id.clear_btn);

        resultView = findViewById(R.id.resultView);


        resultView.setText("");

        one_btn.setOnClickListener(this);
        two_btn.setOnClickListener(this);

        /*three_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(3);
            }
        });*/

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
                processOperation(Operation.ADD);
            }
        });

        substract_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation(Operation.SUBTRACT);
            }
        });

        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation(Operation.MULTIPLY);
            }
        });

        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation(Operation.DIVIDE);
            }
        });

        clear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftValueStr = "";
                rightValueStr = "";
                result = 0;
                runningNumber = "";
                currentOperation = null;
                resultView.setText("");
            }
        });

        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation(Operation.EQUAL);
            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one_btn:
                numberPressed(1);
                break;
            case R.id.two_btn:
                numberPressed(2);
                break;
            case R.id.three_btn:
                numberPressed(3);
                break;
            // implement de overige buttons hier //
            default:
                break;
        }
    }


    void processOperation(Operation operation){
        if (currentOperation != null){

            if (runningNumber != ""){
                rightValueStr = runningNumber;
                runningNumber = "";

                switch (currentOperation){
                    case ADD:
                        result = Integer.parseInt(leftValueStr) + Integer.parseInt(rightValueStr);
                        break;
                    case SUBTRACT:
                        result = Integer.parseInt(leftValueStr) - Integer.parseInt(rightValueStr);
                        break;
                    case DIVIDE:
                        result = Integer.parseInt(leftValueStr) / Integer.parseInt(rightValueStr);
                        break;
                    case MULTIPLY:
                        result = Integer.parseInt(leftValueStr) * Integer.parseInt(rightValueStr);
                        break;
                }

                leftValueStr = String.valueOf(result);
                resultView.setText(leftValueStr);
            }


        }else {
            leftValueStr = runningNumber;
            runningNumber = "";

        }
        currentOperation = operation;
    }


    void numberPressed(int number){
        runningNumber += String.valueOf(number);
        resultView.setText(runningNumber);


    }
}