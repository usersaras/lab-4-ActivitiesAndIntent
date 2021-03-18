package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.hellotoast.MainActivity.*;

public class SecondActivity extends AppCompatActivity {

    private TextView countDisp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        String count=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        countDisp=findViewById(R.id.textCount);
        countDisp.setText(count);
    }
}