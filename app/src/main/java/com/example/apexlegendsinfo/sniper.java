package com.example.apexlegendsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class sniper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sniper);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, guns.class);
        startActivity(intent);
    }
    public void goMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void charge(View view){
        Toast toast = Toast.makeText(this, "Энергетическая винтовка", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void longb(View view){
        Toast toast = Toast.makeText(this, "Длинный лук", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void kraber(View view){
        Toast toast = Toast.makeText(this, "Крабер", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sentinel(View view){
        Toast toast = Toast.makeText(this, "Страж", Toast.LENGTH_SHORT);
        toast.show();
    }
}