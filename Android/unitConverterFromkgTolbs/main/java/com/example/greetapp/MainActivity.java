package com.example.greetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView lblHeader;
    TextView lblResult;
    Button btn;
    EditText txtInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblHeader = findViewById(R.id.lblHeader);
        lblResult = findViewById(R.id.lblResult);
        btn = findViewById(R.id.btn);
        txtInput = findViewById(R.id.txtInput);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double inputEntered = Double.parseDouble(txtInput.getText().toString());
                lblResult.setText("" +conversion(inputEntered) + " Lbs");
            }
        });



    }
    public double conversion(double kilo){
        double ConvertedResult = kilo * 2.20462;
        return ConvertedResult;
    }



}