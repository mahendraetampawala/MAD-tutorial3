package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private EditText text;
    private EditText text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnok=findViewById(R.id.buttonok);
        btnok.setText(R.string.okbtn);

        TextView num1txt=findViewById(R.id.numberone);
        num1txt.setText(R.string.num1);

        TextView num2txt=findViewById(R.id.numbertwo);
        num2txt.setText(R.string.num2);

        text=(EditText)findViewById(R.id.editTextNumber1);
        text1=(EditText)findViewById(R.id.editTextNumber2);


        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selectActivity=new Intent(getApplicationContext(),SecondActivity.class);
                String result=text.getText().toString();
                selectActivity.putExtra("value1",result);
                String result2=text1.getText().toString();
                selectActivity.putExtra("value2",result2);
                startActivity(selectActivity);
                finish();



                Toast toast=Toast.makeText(getApplicationContext(),"Sending message",Toast.LENGTH_LONG);
                toast.show();
                toast.setGravity(Gravity.TOP|Gravity.CENTER,0,0);
            }
        });



    }
}