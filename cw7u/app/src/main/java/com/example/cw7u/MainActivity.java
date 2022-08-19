package com.example.cw7u;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<item> itemArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item item1 = new item("cheese", R.drawable.cheese, 2);
        item item2 = new item("chocolate", R.drawable.chocolate, 4);
        item item3 = new item("coffee", R.drawable.coffee, 3);
        item item4 = new item("donut", R.drawable.donut, 3);

        itemArrayList.add(item1);
        itemArrayList.add(item2);
        itemArrayList.add(item3);
        itemArrayList.add(item4);

        ItemAdapter itemAdapter = new ItemAdapter(this, 0, itemArrayList);
        ListView listView = findViewById(R.id.hmm);
        listView.setAdapter(itemAdapter);

    }
}