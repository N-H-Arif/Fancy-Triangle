package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi;

public class MainActivity3 extends AppCompatActivity implements GoogleApiClient.ConnectionCallbacks {

    CheckBox checkBox;
    GoogleApiClient googleApiClient;

    String SiteKey = "6LfaVpAaAAAAABseMYP7HrAJn1WX6xPTnTx1A728";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        checkBox=findViewById(R.id.check_Box);

        googleApiClient=new GoogleApiClient.Builder(this)
                .addApi(SafetyNet.API)
                .addConnectionCallbacks(MainActivity3.this)
                .build();
        googleApiClient.connect();

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(checkBox.isChecked()){
                    SafetyNet.SafetyNetApi.verifyWithRecaptcha(googleApiClient,SiteKey)
                            .setResultCallback(new ResultCallback<SafetyNetApi.RecaptchaTokenResult>() {
                                @Override
                                public void onResult(@NonNull SafetyNetApi.RecaptchaTokenResult recaptchaTokenResult) {
                                    Status status = recaptchaTokenResult.getStatus();
                                    if((status != null) && status.isSuccess()){

                                        Toast.makeText(getApplicationContext(), "Successfully Varified...", Toast.LENGTH_SHORT).show();
                                        checkBox.setTextColor(Color.GREEN);
                                    }
                                }
                            });
                }else{
                    checkBox.setTextColor(Color.BLACK);
                }
                            }
        });

    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }
}