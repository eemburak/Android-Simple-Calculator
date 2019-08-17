//Coded by Burak 16.08.2019
package com.burak.deneme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText1;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        resultText = findViewById(R.id.textView);


    }

    public void sum (View view){
            if (editText.getText().toString().equalsIgnoreCase("") || editText1.getText().toString().equalsIgnoreCase("")){

            resultText.setText("Result: Please enter a number! ");//This section questioning our editText for against enter nothing :) if you do, you will see an error message :)

        }else{
            String a = editText.getText().toString();
            String b = editText1.getText().toString();//Numbers taken String class from editText. We are doing like this because we need a BigDecimal number for operations. Later, we can change string to BigDecimal number.

            BigDecimal bigDecimalA = new BigDecimal(a);
            BigDecimal bigDecimalB = new BigDecimal(b);//Here String class changing to BigDecimal number.

            BigDecimal resultSum = bigDecimalA.add(bigDecimalB);// Sum up operation. BigDecimal numbers can not use (+,-,*,/). Please careful!
            resultText.setText("Result: " + resultSum);//Showing our result on textView
        }

    }
    public void deduct (View view){
        if (editText.getText().toString().equalsIgnoreCase("") || editText1.getText().toString().equalsIgnoreCase("")){

            resultText.setText("Result: Please enter a number! ");

        }else{
            String a = editText.getText().toString();
            String b = editText1.getText().toString();

            BigDecimal bigDecimalA = new BigDecimal(a);
            BigDecimal bigDecimalB = new BigDecimal(b);

            BigDecimal resultSub = bigDecimalA.subtract(bigDecimalB);// BigDecimal deduct(subtract) operation
            resultText.setText("Result: " + resultSub);
        }

    }
    public void multiply (View view){
        if (editText.getText().toString().equalsIgnoreCase("") || editText1.getText().toString().equalsIgnoreCase("")){

            resultText.setText("Result: Please enter a number! ");

        }else{
            String a = editText.getText().toString();
            String b = editText1.getText().toString();

            BigDecimal bigDecimalA = new BigDecimal(a);
            BigDecimal bigDecimalB = new BigDecimal(b);

            BigDecimal resultMultiply = bigDecimalA.multiply(bigDecimalB);//Multiply operation
            resultText.setText("Result: " + resultMultiply);
        }

    }
    public void divide (View view){
        if (editText.getText().toString().equalsIgnoreCase("") || editText1.getText().toString().equalsIgnoreCase("")){

            resultText.setText("Result: Please enter a number! ");

        }else{
            String a = editText.getText().toString();
            String b = editText1.getText().toString();

            BigDecimal bigDecimalA = new BigDecimal(a);
            BigDecimal bigDecimalB = new BigDecimal(b);

        try {
                BigDecimal resultDiv = bigDecimalA.divide(bigDecimalB,6,BigDecimal.ROUND_HALF_UP);
                resultText.setText("Result: " + resultDiv);//Divide operation
            }catch (ArithmeticException e) {

            String error = "Please enter a number except for Zero! ";//This section coded for if you try to divide a number with "0" Because its an mathematical uncertainty, app can dead with doing this operation :).
            resultText.setText("Result: " + error); }

        }
    }
}
