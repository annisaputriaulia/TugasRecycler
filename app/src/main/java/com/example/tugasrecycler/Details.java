package com.example.tugasrecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    ImageView ivVacayPhoto;
    TextView tvVacayPlaces;
    TextView tvVacayDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ivVacayPhoto = findViewById(R.id.ivDetail);
        tvVacayPlaces = findViewById(R.id.tvDetailName);
        tvVacayDesc = findViewById(R.id.tvDetailSum);

        ivVacayPhoto.setImageResource(getIntent().getIntExtra("poto",0));
        tvVacayPlaces.setText(getIntent().getStringExtra("nama tempat"));
        tvVacayDesc.setText(getIntent().getStringExtra("deskripsi"));


        final Button button = findViewById(R.id.btnBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Details.this, MainActivity.class);
                startActivity(a);
            }
        });
    }

}