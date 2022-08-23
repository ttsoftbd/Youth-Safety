package com.tutorialspoint.myapplicationd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HackingActivity extends AppCompatActivity {

    ImageView hc2,hc3,hc4,hc5,hc6,hc7;
    String[] urls = new String[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hacking);

        hc2 = findViewById(R.id.hc2);
        hc3 = findViewById(R.id.hc3);
        hc4 = findViewById(R.id.hc4);
        hc5 = findViewById(R.id.hc5);
        hc6 = findViewById(R.id.hc6);
        hc7 = findViewById(R.id.hc7);
        urls[0] = "https://ttsoftbd.github.io/hacking/";

        hc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(),WebActivity.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });


        hc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01580673013"));
                startActivity(intent);
            }
        });
    }
}