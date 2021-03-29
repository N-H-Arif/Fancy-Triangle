package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button BtnMove;
    private Button BtnMo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnMove = findViewById(R.id.button2);
        BtnMo = findViewById(R.id.button);
        BtnMove.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveToActivityTwo();
            }
        });
        BtnMo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveToActivitysix();
            }
        });
    }

    private void moveToActivityTwo(){
        Intent intent = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(intent);
    }

    private void moveToActivitysix(){
        Intent intent = new Intent(MainActivity.this,MainActivity4.class);
        startActivity(intent);
    }
}