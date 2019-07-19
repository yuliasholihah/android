package com.example.instalasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class windows extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windows);
        Button prev = (Button) findViewById(R.id.Button02);
        prev.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }

        });
        Button windows7 = (Button) findViewById(R.id.Buttonwindows7);
        windows7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), windows7.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button windows8 = (Button) findViewById(R.id.Buttonwindows);
        windows8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View w8) {
                Intent myIntent = new
                        Intent(w8.getContext(), windows8.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button windows10 = (Button) findViewById(R.id.Buttonwindows10);
        windows10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), windows10.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
