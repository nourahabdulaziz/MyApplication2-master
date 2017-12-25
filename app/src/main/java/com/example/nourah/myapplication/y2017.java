package com.example.nourah.myapplication;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class y2017 extends AppCompatActivity {
    ListView list;

    String[] itemname ={
            "emergency app",
            "Camera",
            "Global",
            "FireFox",
            "UC Browser",
            "Android Folder",
            "VLC Player",
            "Cold War"
    };

    Integer[] imgid={
            R.drawable.emergency_photo,
            R.drawable.emergency_photo,
            R.drawable.emergency_photo,
            R.drawable.emergency_photo,
            R.drawable.emergency_photo,
            R.drawable.emergency_photo,
            R.drawable.emergency_photo,
            R.drawable.emergency_photo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("go back");

        setContentView(R.layout.activity_y2017);


        adapter2017 adapter = new adapter2017(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list) ;

        list.setAdapter(adapter);
        Log.d("rr", "t4");
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(view.getContext(),p1_y2017.class);
                    startActivityForResult(i, 0);
                }

                if (position == 1) {
                    Intent i = new Intent(view.getContext(),y2017.class);
                    startActivityForResult(i, 1);
                }


                if (position == 2) {
                    Intent i = new Intent(view.getContext(),y2017.class);
                    startActivityForResult(i, 2);
                }

                if (position == 3) {
                    Intent i = new Intent(view.getContext(),y2017.class);
                    startActivityForResult(i, 3);
                }

                if (position == 4) {
                    Intent i = new Intent(view.getContext(),y2017.class);
                    startActivityForResult(i, 4);
                }

                if (position == 5) {
                    Intent i = new Intent(view.getContext(),y2017.class);
                    startActivityForResult(i, 5);
                }

                if (position == 6) {
                    Intent i = new Intent(view.getContext(),y2017.class);
                    startActivityForResult(i, 6);
                }


            }
        });
    }


    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();

        if(id==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
}


   }