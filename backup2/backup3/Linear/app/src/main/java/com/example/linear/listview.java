package com.example.linear;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class listview extends ListActivity {

    TextView listview;
    String[] pilihan = {
            "Merbabu" ,"Merapi" ,"Lawu" , "Rinjani" ,
            "Sumbing" , "Sindoro" , "Krakatau" ,"Selat Sunda" ,
            "Selat Bali" , "Selat Malaka" , "Kalimantan" ,
            "Sulawesi" , "Jawa" };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        setListAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,pilihan));
        listview = (TextView) findViewById(R.id.yangDipilih);
    }
    public void  onListItemClick(ListView parent, View v,
       int position, long id) {
             listview.setText(pilihan[position]);
    }
}
