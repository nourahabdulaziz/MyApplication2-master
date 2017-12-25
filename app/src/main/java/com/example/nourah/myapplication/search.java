package com.example.nourah.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class search extends AppCompatActivity {
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;
    BottomNavigationView btmnav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Log.d("test","project");



        btmnav = (BottomNavigationView) findViewById(R.id.navigation);
        Menu menu=btmnav.getMenu();
        MenuItem menuItem=menu.getItem(1);
        menuItem.setChecked(true);

        btmnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Log.d("test", "project5");
                switch (item.getItemId()) {
                    case R.id.navigation_project:
                        Intent i1 = new Intent(search.this, projectspage.class);
                        startActivity(i1);
                        Log.d("test", "from project page in navigation main");

                        break;

                    case R.id.navigation_search:


                        break;

                    case R.id.navigation_profile:
                        Intent i2=new Intent(search.this,profile.class);
                         startActivity(i2);
                        break;

                }
                return false;
            }
        });

    }

}
