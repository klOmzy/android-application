package com.example.apexlegendsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class light extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, guns.class);
        startActivity(intent);
    }
    public void goMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void devo(View view){
        Toast toast = Toast.makeText(this, "Энергетическое оружие Преданность", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void lstar(View view){
        Toast toast = Toast.makeText(this, "Энергетическое оружие Л-Стар", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void spit(View view){
        Toast toast = Toast.makeText(this, "Легкое оружие Спитфаир", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void ram(View view){
        Toast toast = Toast.makeText(this, "Тяжелое оружие Неистовство", Toast.LENGTH_SHORT);
        toast.show();
    }
}