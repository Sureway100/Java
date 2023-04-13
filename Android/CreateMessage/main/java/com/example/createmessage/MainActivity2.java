package com.example.createmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra("extraMessage");
        TextView messageView = (TextView) findViewById(R.id.message);
        messageView.setText(messageText);
    }
}