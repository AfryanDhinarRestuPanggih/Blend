package com.example.blend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list); // Pastikan layout utama sesuai dengan nama XML Anda

        // Menghubungkan ImageView untuk gambar Mangga
        ImageView imageMango = findViewById(R.id.image1);
        imageMango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, MangoActivity.class);
                startActivity(intent);
            }
        });

        // Menghubungkan ImageView untuk gambar Nutella
        ImageView imageNutella = findViewById(R.id.image2);
        imageNutella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, NuttelaActivity.class);
                startActivity(intent);
            }
        });

        // Menghubungkan ImageView untuk gambar Green Goblin
        ImageView imagegreengoblin = findViewById(R.id.image3);
        imagegreengoblin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, GreenActivity.class);
                startActivity(intent);
            }
        });

        // Di dalam onCreate() method pada Activity
        View background1 = findViewById(R.id.background1);
        background1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, MangoActivity.class);
                startActivity(intent);
            }
        });

        View background2 = findViewById(R.id.background2);
        background2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, NuttelaActivity.class);
                startActivity(intent);
            }
        });

        View background3 = findViewById(R.id.background3);
        background3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, GreenActivity.class);
                startActivity(intent);
            }
        });

    }
}