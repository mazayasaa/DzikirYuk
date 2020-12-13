package com.vokasi.dzikiryuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuDzikirPagi extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dzikir_pagi);
        getSupportActionBar().setTitle("Dzikir Pagi");

        listView=findViewById(R.id.listview);

        String[] title=getResources().getStringArray(R.array.title_book_pagi);
        final String[] details=getResources().getStringArray(R.array.detail_book_pagi);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,title);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String iss=details[i];
                Intent ii=new Intent(MenuDzikirPagi.this,DzikirPagiDetails.class);
                ii.putExtra("detail",iss);
                startActivity(ii);
            }
        });
    }
}