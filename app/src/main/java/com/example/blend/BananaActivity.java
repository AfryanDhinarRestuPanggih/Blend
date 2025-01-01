package com.example.blend;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class BananaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana); // Mengatur layout activity

        // Menghubungkan ImageView dengan ID
        ImageView backButton = findViewById(R.id.back_button);
        ImageView favoriteIcon = findViewById(R.id.favorite_icon);

        // Klik listener pada tombol back
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        // Klik listener pada ikon favorite
        favoriteIcon.setOnClickListener(new View.OnClickListener() {
            boolean isFavorite = false;

            @Override
            public void onClick(View v) {
                if (isFavorite) {
                    favoriteIcon.setImageResource(R.drawable.baseline_favorite_border_24);
                } else {
                    favoriteIcon.setImageResource(R.drawable.baseline_favorite_24);
                }
                isFavorite = !isFavorite;
            }
        });
    }
}
