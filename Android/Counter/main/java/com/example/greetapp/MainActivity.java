package com.example.greetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button buttonSub;
    Button buttonAdd;
    TextView lblCounter2;
    TextView lblCounter;
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonSub = findViewById(R.id.button2);
        buttonAdd = findViewById(R.id.button);
        lblCounter2 = findViewById(R.id.lblCounter2);
        lblCounter = findViewById(R.id.lblCounter);


        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                lblCounter2.setText(""+count());
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                lblCounter2.setText(""+negCount());
            }
        });
    }

    public int count() {
        return ++counter;
    }

    public int negCount() {
        return --counter;
    }
}