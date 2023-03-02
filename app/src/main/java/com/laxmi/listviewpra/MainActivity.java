package com.laxmi.listviewpra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Spinner spinners;
    AutoCompleteTextView actxtView;
    ArrayList<String> arrid = new ArrayList<>();

    ArrayList<String> arrName = new ArrayList<>();
    ArrayList<String> arrLang = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        spinners = findViewById(R.id.spinners);
        actxtView = findViewById(R.id.actxtView);
        arrName.add("ram");
        arrName.add("Rahul");
        arrName.add("sunil");
        arrName.add("vijay");
        arrName.add("ram");
        arrName.add("Rahul");
        arrName.add("sunil");
        arrName.add("vijay");
        arrName.add("ram");
        arrName.add("Rahul");
        arrName.add("sunil");
        arrName.add("vijay");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrName);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Click first item", Toast.LENGTH_SHORT).show();

                } else if (position == 1) {
                    Toast.makeText(MainActivity.this, "Click second item", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(MainActivity.this, "Click third item", Toast.LENGTH_SHORT).show();

                }
            }
        });

        //spring
        arrid.add("Adhar card");
        arrid.add("Pan card");
        arrid.add("Voterid");
        arrid.add("DrivingLisence");
        arrid.add("Ration card");
        arrid.add("X th card");
        arrid.add("Xii card");
        ArrayAdapter<String> springAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, arrid);
        spinners.setAdapter((springAdapter));
        //Autocompletetext
        arrLang.add("c");
        arrLang.add("Java");
        arrLang.add("Python");
        arrLang.add(".Net");
        arrLang.add("C++");
        arrLang.add("Sql");

        ArrayAdapter<String> actAdapter = new ArrayAdapter<>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, arrLang);
        actxtView.setAdapter(actAdapter);
        actxtView.setThreshold(1);

    }


}

