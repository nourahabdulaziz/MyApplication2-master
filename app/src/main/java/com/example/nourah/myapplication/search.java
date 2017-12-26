package com.example.nourah.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.nourah.myapplication.projects.english_language;
import com.example.nourah.myapplication.projects.four_questions;
import com.example.nourah.myapplication.projects.prophet;

import java.util.ArrayList;

public class search extends AppCompatActivity {
    static ArrayList<String> items;
    ListView listView;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;
    BottomNavigationView btmnav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        listView=(ListView)findViewById(R.id.listview);
        items=new ArrayList<>();
        items.add("project");
        items.add("project 2017");
        items.add("project 2016");
        items.add("project 2015");
        items.add("project 2014");
        items.add("project 2013");
        items.add("project 2012");
        items.add("project 2011");
        items.add("Questions Qame");
        items.add("Development of the english language");
        items.add("Arrangement Words");
        items.add("Questions about the Prophet");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> adapterView, View view ,int i,long l){
                String text=listView.getItemAtPosition(i).toString();
                Toast.makeText(search.this,"" +text,Toast.LENGTH_SHORT).show();

            }
        });
        btmnav=(BottomNavigationView)findViewById(R.id.navigation);
        Menu menu=btmnav.getMenu();
        MenuItem menuItem=menu.getItem(1);
        menuItem.setChecked(true);
        btmnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_project:
                        Intent i1=new Intent(search.this,projectspage.class);
                        startActivity(i1);

                        break;
                    case R.id.navigation_search:
                        //Intent i2=new Intent(likepage.this,likepage.class);

                        // startActivity(i2);
                        break;
                    case R.id.navigation_profile:
                        Intent i3=new Intent(search.this,profile.class);
                        Log.d("test","from like page befor go to profile page");
                        startActivity(i3);
                        break;
                }
                return false;
            }
        });
    }@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        MenuItem item=menu.findItem(R.id.item_search);
        SearchView searchView=(SearchView) MenuItemCompat.getActionView(item);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<String> templist=new ArrayList<>();
                for (String temp : items){
                    if (temp.toLowerCase().contains(newText.toLowerCase())){
                        templist.add(temp);
                    }
                }
                ArrayAdapter<String> adapter=new ArrayAdapter<>(search.this,
                        android.R.layout.simple_list_item_1,templist);
                listView.setAdapter(adapter);
                return true;
            }
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }
        });listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(view.getContext(), projectspage.class);
                    startActivityForResult(i, 0);
                }
                if (position == 1) {
                    Intent i = new Intent(view.getContext(), y2017.class);
                    startActivityForResult(i, 1);
                }if (position == 2) {
                    Intent i = new Intent(view.getContext(), y2016.class);
                    startActivityForResult(i, 2);
                }if (position == 3) {
                    Intent i = new Intent(view.getContext(), y2015.class);
                    startActivityForResult(i, 3);
                }if (position == 4) {
                    Intent i = new Intent(view.getContext(), y2014.class);
                    startActivityForResult(i, 4);
                }if (position == 5) {
                    Intent i = new Intent(view.getContext(), y2013.class);
                    startActivityForResult(i, 5);
                }if (position == 6) {
                    Intent i = new Intent(view.getContext(), y2012.class);
                    startActivityForResult(i, 6);
                }if (position == 7) {
                    Intent i = new Intent(view.getContext(), y2011.class);
                    startActivityForResult(i, 7);
                }if (position == 8) {
                    Intent i = new Intent(view.getContext(), four_questions.class);
                    startActivityForResult(i, 8);
                }if (position == 9) {
                    Intent i = new Intent(view.getContext(), english_language.class);
                    startActivityForResult(i, 9);
                }if (position == 10) {
                    Intent i = new Intent(view.getContext(), com.example.nourah.myapplication.Arrangement_words.class);
                    startActivityForResult(i, 10);
                }if (position == 11) {
                    Intent i = new Intent(view.getContext(), prophet.class);
                    startActivityForResult(i, 11);
                }
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}
