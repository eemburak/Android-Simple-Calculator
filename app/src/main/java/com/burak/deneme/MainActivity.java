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

            resultText.setText("Result: Please enter a number! ");

        }else{
            String a = editText.getText().toString();
            String b = editText1.getText().toString();

            BigDecimal bigDecimalA = new BigDecimal(a);
            BigDecimal bigDecimalB = new BigDecimal(b);

            BigDecimal resultSum = bigDecimalA.add(bigDecimalB);
            resultText.setText("Result: " + resultSum);
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

            BigDecimal resultSub = bigDecimalA.subtract(bigDecimalB);
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

            BigDecimal resultMultiply = bigDecimalA.multiply(bigDecimalB);
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
                resultText.setText("Result: " + resultDiv);
            }catch (ArithmeticException e) {

            String error = "Please enter a number except for Zero! ";
            resultText.setText("Result: " + error); }

        }
    }
}
