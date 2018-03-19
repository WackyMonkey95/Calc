package com.example.maike.calc;

import android.app.Activity;
import android.media.VolumeShaper;
import android.os.Bundle;
import android.provider.ContactsContract;
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



        findViewById(R.id.one_btn).setOnClickListener(this);
        findViewById(R.id.two_btn).setOnClickListener(this);
        findViewById(R.id.three_btn).setOnClickListener(this);
        findViewById(R.id.four_btn).setOnClickListener(this);
        findViewById(R.id.five_btn).setOnClickListener(this);
        findViewById(R.id.six_btn).setOnClickListener(this);
        findViewById(R.id.seven_btn).setOnClickListener(this);
        findViewById(R.id.eight_btn).setOnClickListener(this);
        findViewById(R.id.nine_btn).setOnClickListener(this);
        findViewById(R.id.zero_btn).setOnClickListener(this);

        ImageButton add_btn = findViewById(R.id.add_btn);
        ImageButton divide_btn = findViewById(R.id.divide_btn);
        ImageButton multiply_btn = findViewById(R.id.multiply_btn);
        ImageButton substract_btn = findViewById(R.id.subtract_btn);
        ImageButton equal_btn = findViewById(R.id.equal_btn);


        Button clear_btn = findViewById(R.id.clear_btn);

        resultView = findViewById(R.id.resultView);


        resultView.setText("");



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
            case R.id.four_btn:
                numberPressed(4);
                break;
            case R.id.five_btn:
                numberPressed(5);
                break;
            case R.id.six_btn:
                numberPressed(6);
                break;
            case R.id.seven_btn:
                numberPressed(7);
                break;
            case R.id.eight_btn:
                numberPressed(8);
                break;
            case R.id.nine_btn:
                numberPressed(9);
                break;
            case R.id.zero_btn:
                numberPressed(0);
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