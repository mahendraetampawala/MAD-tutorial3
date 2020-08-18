package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText num1, num2;
    String number1, number2;
    TextView fanswer;
    private Button buttonP, buttonM, buttonMulti, buttonD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonP = findViewById(R.id.btnplus);
        buttonM = findViewById(R.id.btnminus);
        buttonMulti = findViewById(R.id.btnmultiply);
        buttonD = findViewById(R.id.btndevision);
        fanswer = findViewById(R.id.textViewTot);

        num1 = findViewById(R.id.editTextNumber1);
        num2 = findViewById(R.id.editTextNumber2);

        number1 = getIntent().getExtras().getString("Value1");
        num1.setText(number1);
        number2 = getIntent().getExtras().getString("Value2");
        num2.setText(number2);

        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                int answer = number1 + number2;

                fanswer.setText(number1 + " + " + number2 + " = " + Integer.toString(answer));
            }
        });

        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                int answer = number1 - number2;

                fanswer.setText(number1 + " - " + number2 + " = " + Integer.toString(answer));
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                int answer = number1 * number2;

                fanswer.setText(number1 + " * " + number2 + " = " + Integer.toString(answer) );
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                int answer = number1 / number2;

                fanswer. setText(number1 + " / " + number2 + " = " + Integer.toString(answer));
            }
        });
    }
}