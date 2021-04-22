package com.example.tugasrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewVacay;

    private List<BandsModel> models = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewVacay = findViewById(R.id.rv);
        recyclerViewVacay.setHasFixedSize(true);
        models.addAll(BandsDatabase.getListData());
        recyclerViewVacay.setLayoutManager(new LinearLayoutManager(this));
        BandsAdapter adapter = new BandsAdapter(models);
        recyclerViewVacay.setAdapter(adapter);

    }

}