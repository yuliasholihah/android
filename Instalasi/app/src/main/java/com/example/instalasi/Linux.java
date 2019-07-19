package com.example.instalasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linux extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linux);
        Button prev = (Button) findViewById(R.id.Button02);
        prev.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }

        });
        Button next = (Button) findViewById(R.id.Buttonvideo);
        next.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(view.getContext(), webviewlinux.class);
                startActivityForResult(myintent, 0);
            }

        });
    }
}
