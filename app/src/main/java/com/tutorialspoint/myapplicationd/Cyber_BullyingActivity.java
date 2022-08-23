package com.tutorialspoint.myapplicationd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class Cyber_BullyingActivity extends AppCompatActivity {

    ImageView cb1,cb2,cb3,cb4,cb5,cb6,CyberCall;
    TextView cbt1,cbt2,cbt3,cbt4,cbt5;
    String[] urls = new String[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyber_bullying);

        CyberCall = findViewById(R.id.CyberCall);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        cb6 = findViewById(R.id.cb6);

        cbt1 = findViewById(R.id.cbt1);
        cbt2 = findViewById(R.id.cbt2);
        cbt3 = findViewById(R.id.cbt3);
        cbt4 = findViewById(R.id.cbt4);
        cbt5 = findViewById(R.id.cbt5);
        urls[0] = "https://ttsoftbd.github.io/cyber/";

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbt1.setVisibility(View.VISIBLE);
                cbt2.setVisibility(View.GONE);
                cbt3.setVisibility(View.GONE);
                cbt4.setVisibility(View.GONE);
                cbt5.setVisibility(View.GONE);


            }
        });


        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbt1.setVisibility(View.GONE);
                cbt2.setVisibility(View.VISIBLE);
                cbt3.setVisibility(View.GONE);
                cbt4.setVisibility(View.GONE);
                cbt5.setVisibility(View.GONE);
            }
        });



        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbt1.setVisibility(View.GONE);
                cbt2.setVisibility(View.GONE);
                cbt3.setVisibility(View.VISIBLE);
                cbt4.setVisibility(View.GONE);
                cbt5.setVisibility(View.GONE);
            }
        });



        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbt1.setVisibility(View.GONE);
                cbt2.setVisibility(View.GONE);
                cbt3.setVisibility(View.GONE);
                cbt4.setVisibility(View.VISIBLE);
                cbt5.setVisibility(View.GONE);
            }
        });



        cb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbt1.setVisibility(View.GONE);
                cbt2.setVisibility(View.GONE);
                cbt3.setVisibility(View.GONE);
                cbt4.setVisibility(View.GONE);
                cbt5.setVisibility(View.VISIBLE);
            }
        });

        cb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(),WebActivity.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });



        cbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbt1.setVisibility(View.GONE);
            }
        });


        cbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbt2.setVisibility(View.GONE);
            }
        });



        cbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbt3.setVisibility(View.GONE);
            }
        });



        cbt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbt4.setVisibility(View.GONE);
            }
        });




        cbt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbt5.setVisibility(View.GONE);
            }

        });

        CyberCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01769691522"));
                startActivity(intent);
            }
        });




    }
}