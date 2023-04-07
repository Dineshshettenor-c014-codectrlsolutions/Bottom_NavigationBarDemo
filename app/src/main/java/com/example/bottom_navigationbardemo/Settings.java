package com.example.bottom_navigationbardemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //initilizing and Assigning the variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set settings Selected
        bottomNavigationView.setSelectedItemId(R.id.settings);

        //perform the ItemselectedListner
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.person:
                        startActivity(new Intent(getApplicationContext(),Person.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.settings:
                        return true;
                }
                return false;
            }
        });

    }
}