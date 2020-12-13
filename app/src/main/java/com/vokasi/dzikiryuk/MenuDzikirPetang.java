package com.vokasi.dzikiryuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuDzikirPetang extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir_petang);

        getSupportActionBar().setTitle("Dzikir Petang");

        listView=findViewById(R.id.listview);

        String[] title=getResources().getStringArray(R.array.title_book_petang);
        final String[] details=getResources().getStringArray(R.array.detail_book_petang);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,title);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String iss=details[i];
                Intent ii=new Intent(MenuDzikirPetang.this,DzikirPetangDetails.class);
                ii.putExtra("detail",iss);
                startActivity(ii);
            }
        });
    }
}