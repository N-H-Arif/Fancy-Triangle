package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    private Switch switcheroo;
    private Switch switcheroo2;
    private Switch switcheroo4;
    private Switch switcheroo5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        switcheroo=findViewById(R.id.switch1);
        switcheroo2=findViewById(R.id.switch2);
        switcheroo4=findViewById(R.id.switch4);
        switcheroo5=findViewById(R.id.switch5);

        switcheroo.setOnCheckedChangeListener(this);
        switcheroo2.setOnCheckedChangeListener(this);
        switcheroo4.setOnCheckedChangeListener(this);
        switcheroo5.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean b) {
        switch (buttonView.getId())
        {
            case R.id.switch1:
                if(b)
                    showMessage("On");
                else
                    showMessage("Off");
                break;

            case R.id.switch2:
                if(b)
                    showMessage("Public");
                else
                    showMessage("Private");
                break;

            case R.id.switch4:
                if(b)
                    showMessage("SFX On");
                else
                    showMessage("SFX Off");
                break;

            case R.id.switch5:
                if(b)
                    showMessage("On");
                else
                    showMessage("Off");
                break;
                
        }
    }

    private void showMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}