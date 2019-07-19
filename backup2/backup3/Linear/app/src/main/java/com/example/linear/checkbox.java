package com.example.linear;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class checkbox extends Activity implements
   OnCheckedChangeListener {
    CheckBox cb;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        cb = (CheckBox) findViewById(R.id.check);
        cb.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton buttonView,
                                 boolean isChecked) {
        if (isChecked) {
            cb.setText("checkBox ini : Dicentang!");
        } else {
            cb.setText("checkBox ini : Tidak Dicentang!");

        }
    }
}
