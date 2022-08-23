package com.tutorialspoint.myapplicationd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PlagiarismActivity extends AppCompatActivity {
    ImageView pl6,pl7;
    String[] urls = new String[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plagiarism);

        pl6 = findViewById(R.id.pl6);
        pl7 = findViewById(R.id.pl7);
        urls[0] = "https://ttsoftbd.github.io/plagiarism/";

        pl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(),WebActivity.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });


        pl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01580673013"));
                startActivity(intent);
            }
        });
    }
}