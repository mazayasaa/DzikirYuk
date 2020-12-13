package com.vokasi.dzikiryuk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        CardView menuTasbih = findViewById(R.id.menuTasbih);
        menuTasbih.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, MenuTasbih.class);
                startActivity(intent);
            }
        });

        CardView menuDzikirPagi = findViewById(R.id.menuDzikirPagi);
        menuDzikirPagi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, MenuDzikirPagi.class);
                startActivity(intent);
            }
        });

        CardView menuDzikirPetang = findViewById(R.id.menuDzikirPetang);
        menuDzikirPetang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, MenuDzikirPetang.class);
                startActivity(intent);
            }
        });
    }
}