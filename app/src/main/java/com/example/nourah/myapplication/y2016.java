package com.example.nourah.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class y2016 extends AppCompatActivity {
    ListView list;


    String[] itemname ={
            "Questions about the Prophet",
            "Development of the english language",
            "Arrangement Words",
            "Questions Qame",

    };

    Integer[] imgid={
            R.drawable.prophet,
            R.drawable.english_language,
            R.drawable.order,
            R.drawable.questions,
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("go back");

        setContentView(R.layout.activity_y2016);


        adapter2017 adapter = new adapter2017(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list) ;

        list.setAdapter(adapter);
        Log.d("rr", "t4");
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(view.getContext(),prophet.class);
                    startActivityForResult(i, 0);
                }

                if (position == 1) {
                    Intent i = new Intent(view.getContext(),english_language.class);
                    startActivityForResult(i, 1);
                }


                if (position == 2) {
                    Intent i = new Intent(view.getContext(),Arrangement_words.class);
                    startActivityForResult(i, 2);
                }

                if (position == 3) {
                    Intent i = new Intent(view.getContext(),four_questions.class);
                    startActivityForResult(i, 3);
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
    }}