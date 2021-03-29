package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity4 extends AppCompatActivity {

    private Button BtnMove3;
    private Button BtnMove4;
    private Button BtnMove5;
    private Button BtnMove6;
    private Button BtnMove8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        BtnMove4 = findViewById(R.id.button12);
        BtnMove3 = findViewById(R.id.button9);
        BtnMove5 = findViewById(R.id.button4);
        BtnMove6 = findViewById(R.id.button10);
        BtnMove8 = findViewById(R.id.button13);
        BtnMove3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveToActivityTwos();
            }
        });


        BtnMove4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveToActivityThrees();
            }
        });

        BtnMove5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveToActivityFours();
            }
        });
        BtnMove6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveToActivityFives();
            }
        });
        BtnMove8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveToActivityNiness();
            }
        });
    }

    private void moveToActivityTwos() {
        Intent intent = new Intent(com.example.myapplication.MainActivity4.this, MainActivity5.class);
        startActivity(intent);
    }

    private void moveToActivityThrees() {
        Intent intent = new Intent(com.example.myapplication.MainActivity4.this, MainActivity6.class);
        startActivity(intent);
    }

    private void moveToActivityFours() {
        Intent intent = new Intent(com.example.myapplication.MainActivity4.this, MainActivity7.class);
        startActivity(intent);
    }

    private void moveToActivityFives() {
        Intent intent = new Intent(com.example.myapplication.MainActivity4.this, MainActivity8.class);
        startActivity(intent);
    }

    private void moveToActivityNiness() {
        Intent intent = new Intent(com.example.myapplication.MainActivity4.this, MainActivity.class);
        startActivity(intent);
    }



}
