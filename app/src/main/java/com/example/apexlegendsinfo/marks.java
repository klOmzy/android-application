package com.example.apexlegendsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class marks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, guns.class);
        startActivity(intent);
    }
    public void goMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void scout(View view){
        Toast toast = Toast.makeText(this, "Легкое оружие Разведчик", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void tripletake(View view){
        Toast toast = Toast.makeText(this, "Энергетическое оружие Тройной Эффект", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void repeater(View view){
        Toast toast = Toast.makeText(this, "Тяжелое оружие 30-30", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void bocek(View view){
        Toast toast = Toast.makeText(this, "Боцек", Toast.LENGTH_SHORT);
        toast.show();
    }
}