package com.example.apexlegendsinfo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case
                    R.id.one:
                Intent search = new Intent(this, search.class);
                startActivity(search);
                break;
            case
                    R.id.two:
                Intent intent = new Intent(this, InformationAL.class);
                startActivity(intent);
                break;
            case
                    R.id.three:
                Intent sens = new Intent(this, senscalc.class);
                startActivity(sens);
                break;
            default:

                break;
        }
        return true;
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, InformationAL.class);
        startActivity(intent);
    }
    public void startMapActivity(View v) {
        Intent intent = new Intent(this, maps.class);
        startActivity(intent);
    }
    public void startLegends(View v) {
        Intent intent = new Intent(this, legends.class);
        startActivity(intent);
    }
    public void startGuns(View v) {
        Intent intent = new Intent(this, guns.class);
        startActivity(intent);
    }
    public void startCalc(View v) {
        Intent intent = new Intent(this, senscalc.class);
        startActivity(intent);
    }
}