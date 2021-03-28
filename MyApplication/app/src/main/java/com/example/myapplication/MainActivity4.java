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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        BtnMove3 = findViewById(R.id.button9);
        BtnMove3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveToActivityTwos();
            }
        });
    }

    private void moveToActivityTwos() {
        Intent intent = new Intent(com.example.myapplication.MainActivity4.this, MainActivity5.class);
        startActivity(intent);
    }

    }
