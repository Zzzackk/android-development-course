package com.isaacvono.zacks_bucket_list;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesToGoActivity extends AppCompatActivity {

    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);

        list = findViewById(R.id.recycler_view_places_to_go);

        Item[] items = {
                new Item("Australia", "The thing I'm most excited about is going to all the beaches and islands, that are all throughout the country, I love the people and their energy.", R.drawable.flight_takeoff_ic),
                new Item("Switzerland", "They have the most beautiful mountain landscapes and it's overall dreamlike.", R.drawable.compass_ic),
                new Item("China", "So many different things to discover and food to try, they have one of the most breathtaking architecture and technology 'things'.", R.drawable.globe_ic),
                new Item("Belgium", "One word only: Tomorrowland. Live Today. Love Tomorrow. Unite Forever", R.drawable.checklist_ic),
        };

        ItemsAdapter adapter = new ItemsAdapter(items);

        list.setAdapter(adapter);

    }
}