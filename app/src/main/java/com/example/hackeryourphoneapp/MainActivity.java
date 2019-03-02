package com.example.hackeryourphoneapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final int PERMISSION_REQUEST_CODE = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(GlobalTextChangeService.isAccessibilitySettingsOn(this)){
            Toast.makeText(this,"Enabled",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"Disable",Toast.LENGTH_SHORT).show();
        }

    }

}
