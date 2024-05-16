package com.example.apexlegendsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class legends extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legends);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void Ash(View v) {
        Intent intent = new Intent(this, ash.class);
        startActivity(intent);
    }
    public void fuse(View v) {
        Intent intent = new Intent(this, fuse.class);
        startActivity(intent);
    }
    public void mag(View v) {
        Intent intent = new Intent(this, mag.class);
        startActivity(intent);
    }
    public void bang(View v) {
        Intent intent = new Intent(this, bang.class);
        startActivity(intent);
    }
    public void rev(View v) {
        Intent intent = new Intent(this, rev.class);
        startActivity(intent);
    }
    public void wraith(View v) {
        Intent intent = new Intent(this, wraith.class);
        startActivity(intent);
    }
    public void mirage(View v) {
        Intent intent = new Intent(this, mirage.class);
        startActivity(intent);
    }
    public void octane(View v) {
        Intent intent = new Intent(this, octane.class);
        startActivity(intent);
    }
    public void horizon(View v) {
        Intent intent = new Intent(this, horizon.class);
        startActivity(intent);
    }
    public void valk(View v) {
        Intent intent = new Intent(this, valk.class);
        startActivity(intent);
    }
    public void path(View v) {
        Intent intent = new Intent(this, path.class);
        startActivity(intent);
    }
    public void blood(View v) {
        Intent intent = new Intent(this, blood.class);
        startActivity(intent);
    }
    public void crypto(View v) {
        Intent intent = new Intent(this, crypto.class);
        startActivity(intent);
    }
    public void seer(View v) {
        Intent intent = new Intent(this, seer.class);
        startActivity(intent);
    }
    public void vantage(View v) {
        Intent intent = new Intent(this, vantage.class);
        startActivity(intent);
    }
    public void caustic(View v) {
        Intent intent = new Intent(this, caustic.class);
        startActivity(intent);
    }
    public void watson(View v) {
        Intent intent = new Intent(this, watson.class);
        startActivity(intent);
    }
    public void rampart(View v) {
        Intent intent = new Intent(this, rampart.class);
        startActivity(intent);
    }
    public void catalyst(View v) {
        Intent intent = new Intent(this, catalyst.class);
        startActivity(intent);
    }
    public void ll(View v) {
        Intent intent = new Intent(this, ll.class);
        startActivity(intent);
    }
    public void loba(View v) {
        Intent intent = new Intent(this, loba.class);
        startActivity(intent);
    }
    public void gibby(View v) {
        Intent intent = new Intent(this, gibby.class);
        startActivity(intent);
    }
    public void newcas(View v) {
        Intent intent = new Intent(this, newcas.class);
        startActivity(intent);
    }
}