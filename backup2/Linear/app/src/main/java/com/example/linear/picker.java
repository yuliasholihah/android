package com.example.linear;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;


public class picker extends Activity
   implements View.OnClickListener {

            DateFormat fmtDateAndTime =
            DateFormat.getDateTimeInstance();
            TextView dateAndTimeLabel;
            Calendar dateAndTime =Calendar.getInstance();
            DatePickerDialog.OnDateSetListener d =
            new DatePickerDialog.OnDateSetListener(){
                @Override
                public void onDateSet (DatePicker view,int year, int month,
                                       int day) {

                    dateAndTime.set(Calendar.YEAR, year);
                    dateAndTime.set(Calendar.MONTH, month);
                    dateAndTime.set(Calendar.DAY_OF_MONTH, day);
                    updateLabel();
                   }
                };
                 TimePickerDialog.OnTimeSetListener t =
            new  TimePickerDialog.OnTimeSetListener() {
             @Override
            public void  onTimeSet(TimePicker view, int jam, int menit) {
            dateAndTime.set(Calendar.HOUR_OF_DAY, jam);
            dateAndTime.set(Calendar.MINUTE, menit);
            updateLabel();
}
};
    @Override
   public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_picker);

         Button dayBtn = (Button) findViewById(R.id.dayBtn);
         dayBtn.setOnClickListener(this);
         Button timeBtn = (Button) findViewById(R.id.timeBtn);
         timeBtn.setOnClickListener(this);
         dateAndTimeLabel = (TextView) findViewById(R.id.dateAndTime);
         updateLabel();
         }

         @Override
   public void onClick(View v) {
         // TODO Auto-generated method stub
         switch (v.getId()) {
             case R.id.dayBtn:
                 settingTanggal();
                 break;
             case R.id.timeBtn:
                setJam();
                 break;
             }
         }

         private void updateLabel() {
         dateAndTimeLabel.setText(
                 fmtDateAndTime.format(dateAndTime.getTime()));
         }
    private void settingTanggal() {
         new DatePickerDialog(picker.this, d,
                 dateAndTime.get(Calendar.YEAR),
                 dateAndTime.get(Calendar.MONTH),
                 dateAndTime.get(Calendar.DAY_OF_MONTH)).show();
         }

    private void setJam() {
        new TimePickerDialog(picker.this, t,
                 dateAndTime.get(Calendar.HOUR_OF_DAY),
                 dateAndTime.get(Calendar.MINUTE), true).show();
         }
 }
