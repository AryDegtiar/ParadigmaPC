package com.ary.paradigmapc.ui.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ary.paradigmapc.R;

public class InfoPcArqui extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_pc_arqui);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}