package com.tutorialspoint.myapplicationd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SafeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safe);
    }
}