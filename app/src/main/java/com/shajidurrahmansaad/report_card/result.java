package com.shajidurrahmansaad.report_card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class result extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String StudentName = intent.getStringExtra(MainActivity.StudentName);

        textView = findViewById(R.id.resultName);
        textView.setText(StudentName);


        imageView = findViewById(R.id.resultImg);
        imageView.setImageResource(R.drawable.ic_launcher_background);

        ListView listView = findViewById(R.id.resultlist);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Bangla => 90");
        arrayList.add("english => 90");
        arrayList.add("math => 90");
        arrayList.add("science => 90");
        arrayList.add("global science => 90");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(result.this, android.R.layout.simple_list_item_1);
        listView.setAdapter(arrayAdapter);



    }
}