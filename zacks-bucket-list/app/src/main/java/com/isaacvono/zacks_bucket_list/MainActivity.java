package com.isaacvono.zacks_bucket_list;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    MaterialCardView thingsToDoCardView;
    MaterialCardView placesToGoCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thingsToDoCardView = findViewById(R.id.card_view_things);
        placesToGoCardView = findViewById(R.id.card_view_places);

        thingsToDoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thingsToDoActivityIntent = new Intent(MainActivity.this, ThingsToDoActivity.class);

                setIntent(thingsToDoActivityIntent);

            }
        });

        placesToGoCardView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placesToGoActivityIntent = new Intent(MainActivity.this, PlacesToGoActivity.class);

                setIntent(placesToGoActivityIntent);
            }
        }));

    }
}