package com.tutorialspoint.myapplicationd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class DipressionActivity extends AppCompatActivity {

    ImageView tipa9,islamiTips,tip;
    TextView ninetext,islamictext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dipression);

        tipa9 = findViewById(R.id.tipa9);
        ninetext = findViewById(R.id.ninetext);
        islamiTips = findViewById(R.id.islamiTips);
        islamictext = findViewById(R.id.islamictext);
        tip = findViewById(R.id.tip);

        tipa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ninetext.setVisibility(View.VISIBLE);
            }
        });

        ninetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ninetext.setVisibility(View.GONE);
            }
        });


        islamiTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islamictext.setVisibility(View.VISIBLE);
            }
        });

        islamictext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islamictext.setVisibility(View.GONE);
            }
        });

        tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DipressionActivity.this,VideoActivity.class);
                startActivity(intent);
            }
        });





    }
}