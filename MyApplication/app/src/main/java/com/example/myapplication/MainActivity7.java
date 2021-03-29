package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    private Button BtnMov;
    private Button BtnMov2;
    private Button BtnMov3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        BtnMov = findViewById(R.id.button10);
        BtnMov2 = findViewById(R.id.button13);
        BtnMov3 = findViewById(R.id.button12);

        BtnMov.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveToActivityFivess();
            }
        });
        BtnMov2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveToActivityFivesss();
            }
        });
        BtnMov3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveToActivityFivessss();
            }
        });
    }

    private void moveToActivityFivess() {
        Intent intent = new Intent(com.example.myapplication.MainActivity7.this, MainActivity8.class);
        startActivity(intent);
    }

    private void moveToActivityFivesss() {
        Intent intent = new Intent(com.example.myapplication.MainActivity7.this, MainActivity.class);
        startActivity(intent);
    }
    private void moveToActivityFivessss() {
        Intent intent = new Intent(com.example.myapplication.MainActivity7.this, MainActivity6.class);
        startActivity(intent);
    }

}