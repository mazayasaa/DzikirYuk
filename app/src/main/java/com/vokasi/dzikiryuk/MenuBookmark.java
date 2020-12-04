package com.vokasi.dzikiryuk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MenuBookmark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bookmark);
        getSupportActionBar().setTitle("Bookmark");
    }
}