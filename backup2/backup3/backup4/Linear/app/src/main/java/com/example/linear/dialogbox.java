package com.example.linear;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class dialogbox extends Activity implements View.OnClickListener {
    Button pesanToast;
    Button keluar;
    Button tamplList;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotakdialog);

        pesanToast = (Button) findViewById(R.id.toastBtn);
        pesanToast.setOnClickListener(this);
        keluar = (Button) findViewById(R.id.exitBtn);
        keluar.setOnClickListener(this);
        tamplList = (Button) findViewById(R.id.listDialogBtn);
        tamplList.setOnClickListener(this);
    }
    public void  onClick(View clicked){
        switch (clicked.getId()){
            case R.id.listDialogBtn:
                munculListDialog();
                break;
            case R.id.toastBtn:
                Toast.makeText(this, "Kamu memilih Toast", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exitBtn:
                exit();
                break;
        }
    }
    private void munculListDialog(){
        final CharSequence[] items = {"Es Teh","Es Jeruk","Lemon Squash","Soft Drink"};

        AlertDialog.Builder kk = new AlertDialog.Builder(this);
        kk.setTitle("Pilih minuman");
        kk.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                Toast.makeText(getApplicationContext(), items[item],
                        Toast.LENGTH_SHORT).show();
            }
        }).show();
    }
    private void exit(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("apakah kamu benar benar ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        dialogbox.this.finish();
                    }
                }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int arg1) {
                dialog.cancel();
            }
        }).show();
    }
}