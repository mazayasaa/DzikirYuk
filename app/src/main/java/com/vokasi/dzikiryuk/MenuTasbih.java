package com.vokasi.dzikiryuk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuTasbih extends AppCompatActivity {
    private TextView mShowCount;
    private int mCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);
        mShowCount=findViewById(R.id.countView);
        getSupportActionBar().setTitle("Tasbih");
    }

    public void hitung(View view) {
        if (mCount < 1000){
            mCount++;
            if(mShowCount!=null){
                mShowCount.setText(Integer.toString(mCount));
            }
        }
    }

    public void reset(View view) {
        mCount=0;
        mShowCount.setText(String.valueOf(mCount));
    }
}