package com.ary.paradigmapc.ui.AprendePC;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ary.paradigmapc.R;

public class AprendeFuente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprende_fuente);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}