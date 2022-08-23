package com.tutorialspoint.myapplicationd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Eve_TeasingActivity extends AppCompatActivity {

    ImageView ev2,ev3,ev4,ev5,ev6,ev7,ev8;
    TextView evt1,evt2,evt3,evt4,evt5;
    String[] urls = new String[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eve_teasing);

        ev2 = findViewById(R.id.ev2);
        ev3 = findViewById(R.id.ev3);
        ev4 = findViewById(R.id.ev4);
        ev5 = findViewById(R.id.ev5);
        ev6 = findViewById(R.id.ev6);
        ev7 = findViewById(R.id.ev7);
        ev8 = findViewById(R.id.ev8);

        evt1 = findViewById(R.id.evt1);
        evt2 = findViewById(R.id.evt2);
        evt3 = findViewById(R.id.evt3);
        evt4 = findViewById(R.id.evt4);
        evt5 = findViewById(R.id.evt5);
        urls[0] = "https://ttsoftbd.github.io/eveteasing/";


        ev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evt1.setVisibility(View.VISIBLE);
                evt2.setVisibility(View.GONE);
                evt3.setVisibility(View.GONE);
                evt4.setVisibility(View.GONE);
                evt5.setVisibility(View.GONE);
            }
        });


        ev3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evt1.setVisibility(View.GONE);
                evt2.setVisibility(View.VISIBLE);
                evt3.setVisibility(View.GONE);
                evt4.setVisibility(View.GONE);
                evt5.setVisibility(View.GONE);
            }
        });



        ev4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evt1.setVisibility(View.GONE);
                evt2.setVisibility(View.GONE);
                evt3.setVisibility(View.VISIBLE);
                evt4.setVisibility(View.GONE);
                evt5.setVisibility(View.GONE);
            }
        });



        ev5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evt1.setVisibility(View.GONE);
                evt2.setVisibility(View.GONE);
                evt3.setVisibility(View.GONE);
                evt4.setVisibility(View.VISIBLE);
                evt5.setVisibility(View.GONE);
            }
        });



        ev6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evt1.setVisibility(View.GONE);
                evt2.setVisibility(View.GONE);
                evt3.setVisibility(View.GONE);
                evt4.setVisibility(View.GONE);
                evt5.setVisibility(View.VISIBLE);
            }
        });

        ev7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(),WebActivity.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });

        ev8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01580673013"));
                startActivity(intent);

            }
        });




        evt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evt1.setVisibility(View.GONE);
            }
        });


        evt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evt2.setVisibility(View.GONE);
            }
        });



        evt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evt3.setVisibility(View.GONE);
            }
        });



        evt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evt4.setVisibility(View.GONE);
            }
        });




        evt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evt5.setVisibility(View.GONE);
            }
        });








    }
}