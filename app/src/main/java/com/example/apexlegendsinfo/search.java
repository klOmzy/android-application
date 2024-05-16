package com.example.apexlegendsinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class search extends AppCompatActivity {

    ListView listView;
    String[] name = {"Описание игры","Карты","Легенды","Оружие","Калькулятор"};

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Toolbar toolbar = findViewById(R.id.searchbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Поисковая страница");

        listView = findViewById(R.id.listview);

        arrayAdapter = new ArrayAdapter<String>(this, R.layout.colortext,name);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int postion, long id) {
                if (postion == 0) {
                    Intent info = new Intent(view.getContext(), InformationAL.class);
                    startActivity(info);
                }
                if (postion == 1) {
                    Intent info = new Intent(view.getContext(), maps.class);
                    startActivity(info);
                }
                if (postion == 2) {
                    Intent info = new Intent(view.getContext(), legends.class);
                    startActivity(info);
                }
                if (postion == 3) {
                    Intent info = new Intent(view.getContext(), guns.class);
                    startActivity(info);
                }
                if (postion == 4) {
                    Intent info = new Intent(view.getContext(), senscalc.class);
                    startActivity(info);
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.searchmenu, menu);

        MenuItem menuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Введите что вы хотите найти");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}