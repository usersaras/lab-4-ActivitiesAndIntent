package com.example.lab4_codingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    public static final String EXTRA_MESSAGE =
            "com.example.android.Lab4.extra.MESSAGE";

    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
    }

    public void secondActivityLauncher(View view){
        Intent intent = new Intent(this,  MainActivity2.class);

        switch(view.getId()){
            case R.id.button:
                Log.d(LOG_TAG, "Button 1 clicked!");
                intent.putExtra(EXTRA_MESSAGE,11);
                startActivity(intent);
                break;

            case R.id.button2:
                Log.d(LOG_TAG, "Button 2 clicked!");
                intent.putExtra(EXTRA_MESSAGE,22);
                startActivity(intent);
                break;

            case R.id.button3:
                Log.d(LOG_TAG, "Button 3 clicked!");
                intent.putExtra(EXTRA_MESSAGE,33);
                startActivity(intent);
                break;
        }
    }
}