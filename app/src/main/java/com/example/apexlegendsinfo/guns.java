package com.example.apexlegendsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class guns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guns);

    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void ar(View v) {
        Intent intent = new Intent(this, ar.class);
        startActivity(intent);
    }
    public void smg(View v) {
        Intent intent = new Intent(this, smg.class);
        startActivity(intent);
    }
    public void light(View v) {
        Intent intent = new Intent(this, light.class);
        startActivity(intent);
    }
    public void marks(View v) {
        Intent intent = new Intent(this, marks.class);
        startActivity(intent);
    }
    public void sniper(View v) {
        Intent intent = new Intent(this, sniper.class);
        startActivity(intent);
    }
    public void shotguns(View v) {
        Intent intent = new Intent(this, shotguns.class);
        startActivity(intent);
    }
    public void pistols(View v) {
        Intent intent = new Intent(this, pistols.class);
        startActivity(intent);
    }
}
