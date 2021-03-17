package com.example.lab4_codingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.lab4_codingchallenge.MainActivity.EXTRA_MESSAGE;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView1);

        Intent intent=getIntent();
        int value=intent.getIntExtra(EXTRA_MESSAGE,0);

        if(value==11)
        {
             text=getString(R.string.text1);
        }

        else if(value==22){
            {
                text=getString(R.string.text2);
            }
        }

        else if(value==33){
            text=getString(R.string.text3);
        }

        textView.setText(text);
    }
}