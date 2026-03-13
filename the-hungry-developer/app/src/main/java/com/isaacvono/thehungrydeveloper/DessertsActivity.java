package com.isaacvono.thehungrydeveloper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {
                new Dish("Chocolate Lava Cake", "A warm chocolate cake with a rich, molten center", 899),
                new Dish("Classic Tiramisu", "Layers of coffee-soaked biscuits and creamy mascarpone", 599),
                new Dish("Strawberry Cheesecake", "Smooth cream cheese filling topped with sweet strawberries", 1099),
                new Dish("Crème Brûlée", "Silky vanilla custard with a crisp caramelized sugar crust", 1299),
                new Dish("Apple Crumble", "Baked apples topped with a buttery, crunchy crumble", 899),
        };

        ArrayAdapter<Dish> dessertsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);

        dessertsList.setAdapter(dessertsAdapter);
    }
}