package com.tutorialspoint.myapplicationd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DomesticActivity extends AppCompatActivity {

    ImageView dm2,dm3,dm4,dm5,dm6,dm7,dm8;
    TextView dt2,dt3,dt4,dt6,dt7;
    String[] urls = new String[2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domestic);

        dm2 = findViewById(R.id.dm2);
        dm3 = findViewById(R.id.dm3);
        dm4 = findViewById(R.id.dm4);
        dm5 = findViewById(R.id.dm5);
        dm6 = findViewById(R.id.dm6);
        dm7 = findViewById(R.id.dm7);


        dt2 = findViewById(R.id.dt2);
        dt3 = findViewById(R.id.dt3);
        dt4 = findViewById(R.id.dt4);
        dt6 = findViewById(R.id.dt6);
        dt7 = findViewById(R.id.dt7);
        dm8 = findViewById(R.id.dm8);



        urls[0] = "https://ttsoftbd.github.io/domestic/";

        dm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dt2.setVisibility(View.VISIBLE);
                dt3.setVisibility(View.GONE);
                dt4.setVisibility(View.GONE);
                dt6.setVisibility(View.GONE);
                dt7.setVisibility(View.GONE);

            }
        });

        dm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dt2.setVisibility(View.GONE);
                dt3.setVisibility(View.VISIBLE);
                dt4.setVisibility(View.GONE);
                dt6.setVisibility(View.GONE);
                dt7.setVisibility(View.GONE);

            }
        });

        dm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dt2.setVisibility(View.GONE);
                dt3.setVisibility(View.GONE);
                dt4.setVisibility(View.VISIBLE);
                dt6.setVisibility(View.GONE);
                dt7.setVisibility(View.GONE);

            }
        });


        dm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dt2.setVisibility(View.GONE);
                dt3.setVisibility(View.GONE);
                dt4.setVisibility(View.GONE);
                dt6.setVisibility(View.VISIBLE);
                dt7.setVisibility(View.GONE);

            }
        });


        dm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dt2.setVisibility(View.GONE);
                dt3.setVisibility(View.GONE);
                dt4.setVisibility(View.GONE);
                dt6.setVisibility(View.GONE);
                dt7.setVisibility(View.VISIBLE);

            }
        });

        dm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(),WebActivity.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });

        dm8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01580673013"));
                startActivity(intent);
            }
        });


    }
}