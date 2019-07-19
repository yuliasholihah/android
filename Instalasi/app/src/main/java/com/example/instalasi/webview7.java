package com.example.instalasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webview7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview7);

        WebView web = (WebView) findViewById(R.id.webview7);
        web.loadUrl("https://youtu.be/mHajJDdRnxE");

    }
}
