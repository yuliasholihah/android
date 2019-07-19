package com.example.instalasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webviewlinux extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewlinux);
        WebView web = (WebView) findViewById(R.id.webviewlinux);
        web.loadUrl("https://youtu.be/pAruzbxDWDE");


    }
}

