package com.example.apexlegendsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class maps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goToCanyon(View v) {
        Intent intent = new Intent(this, Canyon.class);
        startActivity(intent);
    }
    public void goToWE(View v) {
        Intent intent = new Intent(this, WE.class);
        startActivity(intent);
    }
    public void goToOlympus(View v) {
        Intent intent = new Intent(this, Olympus.class);
        startActivity(intent);
    }
    public void goToSP(View v) {
        Intent intent = new Intent(this, SP.class);
        startActivity(intent);
    }
    public void goToBM(View v) {
        Intent intent = new Intent(this, BM.class);
        startActivity(intent);
    }
}