package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview1);
        ArrayList<FruitModel> list  = new ArrayList<>();
        list.add(new FruitModel("Apple",R.drawable.apple));
        list.add(new FruitModel("Banana",R.drawable.banana));
        list.add(new FruitModel("Orange",R.drawable.orange));
        list.add(new FruitModel("Grapes",R.drawable.grapes));

        CustomAdapter adapter = new CustomAdapter(list,this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
    }
}