package com.isaacvono.zacks_bucket_list;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsToDoActivity extends AppCompatActivity {

    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        list = findViewById(R.id.recycler_view_things_to_do);

        Item[] items = {
                new Item("Bungee Jump", "I already went skydiving, now I want this new challenge!", R.drawable.flight_takeoff_ic),
                new Item("First Rave", "Always wanted to feel the true bass and just let myself go on a big field with bright colors.", R.drawable.compass_ic),
                new Item("New Year's Trip", "Just wanna have fun with my girlfriend and my friends near the beach. And keep these memories for ever.", R.drawable.globe_ic),
                new Item("Marathon", "That's one of my most important goals for the years 2027, I know I can, just need to put the hours in.", R.drawable.checklist_ic),
        };

        ItemsAdapter adapter = new ItemsAdapter(items);

        list.setAdapter(adapter);

    }
}