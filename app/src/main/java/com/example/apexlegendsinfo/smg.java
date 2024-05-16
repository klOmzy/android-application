package com.example.apexlegendsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class smg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smg);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, guns.class);
        startActivity(intent);
    }
    public void goMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void alt(View view){
        Toast toast = Toast.makeText(this, "Легкое оружие Альтернатор", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void prowler(View view){
        Toast toast = Toast.makeText(this, "Тяжелое оружие Ищейка", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void r99(View view){
        Toast toast = Toast.makeText(this, "Легкое оружие R-99", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void volt(View view){
        Toast toast = Toast.makeText(this, "Энергетическое оружие Вольт", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void car(View view){
        Toast toast = Toast.makeText(this, "Тяжелое оружие C.A.R", Toast.LENGTH_SHORT);
        toast.show();
    }
}