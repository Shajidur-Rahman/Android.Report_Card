package com.shajidurrahmansaad.report_card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static String StudentName = "com.shajidurrahmansaad.report_card.StudentName";
    public  String TAG = "ShajidurRahman";
    ListView nameListView;

    ArrayList<String> name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = new ArrayList<>();
        name.add("Shajidur Rahman");
        name.add("Shajidur Rahman");
        name.add("Shajidur Rahman");
        name.add("Shajidur Rahman");
        name.add("Shajidur Rahman");
        name.add("Muhib");

        ArrayAdapter<String> nameAdapter = new ArrayAdapter<String>(this, R.layout.name, name);
        nameListView = findViewById(R.id.fullCard);

        nameListView.setAdapter(nameAdapter);

        nameListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String toast = "items " + position + ((TextView) view).getText().toString() + " ";
                StudentName = ((TextView) view).getText().toString() + " ";
                Intent result = new Intent(MainActivity.this, com.shajidurrahmansaad.report_card.result.class);
                startActivity(result);
            }
        });


    }

}