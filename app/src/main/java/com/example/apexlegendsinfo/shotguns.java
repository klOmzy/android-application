package com.example.apexlegendsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class shotguns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shotguns);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, guns.class);
        startActivity(intent);
    }
    public void goMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void eva(View view){
        Toast toast = Toast.makeText(this, "EVA-8", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void mas(View view){
        Toast toast = Toast.makeText(this, "Мастифф", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void mozam(View view){
        Toast toast = Toast.makeText(this, "Мозамбик", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void peace(View view){
        Toast toast = Toast.makeText(this, "Миротворец", Toast.LENGTH_SHORT);
        toast.show();
    }
}