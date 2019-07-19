package com.example.instalasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aksilanjut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksilanjut);
        Button prev = (Button) findViewById(R.id.Button02);
        prev.setOnClickListener(new  View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }

        });
        Button next = (Button) findViewById(R.id.Buttonlinux);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Linux.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button windows = (Button) findViewById(R.id.Buttonwindows);
        windows.setOnClickListener(new View.OnClickListener() {

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), windows.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}


