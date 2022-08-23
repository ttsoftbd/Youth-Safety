package com.tutorialspoint.myapplicationd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class Child_MarrigeActivity extends AppCompatActivity {
    
    ImageView cm2,cm3,cm4,cm5,cm6,cm7;
    String[] urls = new String[2];
    TextView bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_marrige);

        cm2 = findViewById(R.id.cm2);
        cm3 = findViewById(R.id.cm3);
        cm4 = findViewById(R.id.cm4);
        cm5 = findViewById(R.id.cm5);
        cm6 = findViewById(R.id.cm6);
        cm7 = findViewById(R.id.cm7);

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);

        urls[0] = "https://ttsoftbd.github.io/childmarrige/";



        cm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt1.setVisibility(View.VISIBLE);
                bt2.setVisibility(View.GONE);
                bt3.setVisibility(View.GONE);
                bt4.setVisibility(View.GONE);
            }
        });

        cm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt1.setVisibility(View.GONE);
                bt2.setVisibility(View.VISIBLE);
                bt3.setVisibility(View.GONE);
                bt4.setVisibility(View.GONE);
            }
        });


        cm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt1.setVisibility(View.GONE);
                bt2.setVisibility(View.GONE);
                bt3.setVisibility(View.VISIBLE);
                bt4.setVisibility(View.GONE);
            }
        });


        cm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt1.setVisibility(View.GONE);
                bt2.setVisibility(View.GONE);
                bt3.setVisibility(View.GONE);
                bt4.setVisibility(View.VISIBLE);
            }
        });

        cm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(),WebActivity.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });

        cm7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01580673013"));
                startActivity(intent);
            }
        });



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt1.setVisibility(View.GONE);
            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt2.setVisibility(View.GONE);
            }
        });



        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt3.setVisibility(View.GONE);
            }
        });



        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt4.setVisibility(View.GONE);
            }
        });




    }
}