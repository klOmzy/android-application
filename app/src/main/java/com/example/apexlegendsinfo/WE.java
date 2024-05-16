package com.example.apexlegendsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_we);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, maps.class);
        startActivity(intent);
    }
    public void goMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void FullWE(View v) {
        Intent intent = new Intent(this, FullWE.class);
        startActivity(intent);
    }
}