package com.ary.paradigmapc.ui.AprendePC;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ary.paradigmapc.R;

public class AprendeProcesador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprende_procesador);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}