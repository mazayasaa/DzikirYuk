package com.vokasi.dzikiryuk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DzikirPetangDetails extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir_petang_details);
        getSupportActionBar().setTitle("Dzikir Petang");

        textView=findViewById(R.id.textt);

        String details=getIntent().getStringExtra("detail");
        textView.setText(details);
    }
}