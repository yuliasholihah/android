package com.example.instalasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webview8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview8);

        WebView web = (WebView) findViewById(R.id.webview8);
        web.loadUrl("https://youtu.be/6GXf4qmcZ31");


    }
}
