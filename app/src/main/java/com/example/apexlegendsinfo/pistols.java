package com.example.apexlegendsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class pistols extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pistols);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, guns.class);
        startActivity(intent);
    }
    public void goMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void re(View view){
        Toast toast = Toast.makeText(this, "Легкий пистолет RE-45", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void pt(View view){
        Toast toast = Toast.makeText(this, "Легкий пистолет P-2020", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void wing(View view){
        Toast toast = Toast.makeText(this, "Снайперский пистолет Ведомый", Toast.LENGTH_SHORT);
        toast.show();
    }
}