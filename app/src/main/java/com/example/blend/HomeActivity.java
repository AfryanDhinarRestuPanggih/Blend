package com.example.blend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // layout file yang berisi ImageView

        // Referensi ke ImageView
        ImageView mainImage = findViewById(R.id.mainImage);

        // Set OnClickListener pada ImageView
        mainImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman berikutnya (NextActivity)
                Intent intent = new Intent(HomeActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
    }
}