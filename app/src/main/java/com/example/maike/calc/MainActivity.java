package com.example.maike.calc;

import android.app.Activity;
import android.media.VolumeShaper;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView resultView;

    public enum Operation {
        ADD, SUBTRACT, DIVIDE, MULTIPLY, EQUAL
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

        findViewById(R.id.add_btn).setOnClickListener(this);
        findViewById(R.id.divide_btn).setOnClickListener(this);
        findViewById(R.id.multiply_btn).setOnClickListener(this);
        findViewById(R.id.subtract_btn).setOnClickListener(this);
        findViewById(R.id.equal_btn).setOnClickListener(this);
        findViewById(R.id.clear_btn).setOnClickListener(this);

        resultView = findViewById(R.id.resultView);

        resultView.setText("");
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
            case R.id.add_btn:
                processOperation(Operation.ADD);
                break;
            case R.id.divide_btn:
                processOperation(Operation.DIVIDE);
                break;
            case R.id.multiply_btn:
                processOperation(Operation.MULTIPLY);
                break;
            case R.id.subtract_btn:
                processOperation(Operation.SUBTRACT);
                break;
            case R.id.equal_btn:
                processOperation(Operation.EQUAL);
                break;
            case R.id.clear_btn:
                leftValueStr = "";
                rightValueStr = "";
                result = 0;
                runningNumber = "";
                currentOperation = null;
                resultView.setText("");
                break;
            default:
                break;
        }
    }


    void processOperation(Operation operation) {
        if (currentOperation != null) {

            if (runningNumber != "") {
                rightValueStr = runningNumber;
                runningNumber = "";

                switch (currentOperation) {
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


        } else {
            leftValueStr = runningNumber;
            runningNumber = "";

        }
        currentOperation = operation;
    }


    void numberPressed(int number) {
        runningNumber += String.valueOf(number);
        resultView.setText(runningNumber);
    }
}