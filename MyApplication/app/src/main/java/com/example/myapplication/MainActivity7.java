package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    private Button BtnMov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        BtnMov = findViewById(R.id.button10);

        BtnMov.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveToActivityFivess();
            }
        });
    }

    private void moveToActivityFivess() {
        Intent intent = new Intent(com.example.myapplication.MainActivity7.this, MainActivity8.class);
        startActivity(intent);
    }

}