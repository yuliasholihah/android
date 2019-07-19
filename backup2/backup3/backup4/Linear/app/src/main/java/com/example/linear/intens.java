package com.example.linear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intens extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intens);

        Button next = (Button) findViewById(R.id.Button01);
        next.setOnClickListener(new View.OnClickListener() {

        public void onClick(View bebek) {
            Intent myIntent = new
                    Intent(bebek.getContext(), intens2.class);
                    startActivityForResult(myIntent, 0);
        }
        });
    }
}
