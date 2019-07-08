package com.example.addnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button add;
    Button sub;
    Button mul;
    Button div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.etNum1);
        num2 = (EditText) findViewById(R.id.etNum2);

        add = (Button) findViewById(R.id.btnAdd);
        sub = (Button) findViewById(R.id.btnSub);
        mul = (Button) findViewById(R.id.btnMul);
        div = (Button) findViewById(R.id.btnDiv);

        result = (TextView) findViewById(R.id.tvAns);
    }

    public void addNumber(View view) {

        int number1, number2, sum;

        number1 = Integer.parseInt(num1.getText().toString());
        number2 = Integer.parseInt(num2.getText().toString());

        sum = number1 + number2;

        result.setText(String.valueOf(sum));

    }


    public void subNumber(View view) {
        int number1, number2, diff;

        number1 = Integer.parseInt(num1.getText().toString());
        number2 = Integer.parseInt(num2.getText().toString());
        diff = number1 - number2;

        result.setText(String.valueOf(diff));
    }

    public void mulNumber(View view) {
        int number1, number2, mulAns;

        number1 = Integer.parseInt(num1.getText().toString());
        number2 = Integer.parseInt(num2.getText().toString());

        mulAns = number1 * number2;

        result.setText(String.valueOf(mulAns));
    }

    public void divNumber(View view) {
        int number1, number2, divAns;


        number1 = Integer.parseInt(num1.getText().toString());
        number2 = Integer.parseInt(num2.getText().toString());

        divAns = number1 / number2;

        result.setText(String.valueOf(divAns));
    }
}
