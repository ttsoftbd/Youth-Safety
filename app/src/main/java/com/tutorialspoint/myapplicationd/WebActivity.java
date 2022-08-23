package com.tutorialspoint.myapplicationd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView myWebview;




    @Override
    public void onBackPressed() {
        if (myWebview.canGoBack()) {
            myWebview.goBack();
        } else {
            super.onBackPressed();
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        myWebview = findViewById(R.id.myWebview);

        Intent intent = getIntent();
        String website = intent.getStringExtra("links");
        myWebview.loadUrl(website);
        myWebview.setWebViewClient(new WebViewClient());
        WebSettings webSettings =myWebview.getSettings();
        myWebview.getSettings().setJavaScriptEnabled(true);
        myWebview.getSettings().setLoadWithOverviewMode(true);
        myWebview.getSettings().setUseWideViewPort(true);



    }
}