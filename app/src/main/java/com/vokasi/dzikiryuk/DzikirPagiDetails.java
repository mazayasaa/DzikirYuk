package com.vokasi.dzikiryuk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DzikirPagiDetails extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir_pagi_details);
        getSupportActionBar().setTitle("Dzikir Pagi");

        textView=findViewById(R.id.textt);

        String details=getIntent().getStringExtra("detail");

        textView.setText(details);
    }
}