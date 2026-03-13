package com.isaacvono.zacks_android_projects;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    RecyclerView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Project[] projects = {
                new Project("Getting Started App", "My very first 'Hello World' app. (The default Android Studio template project", R.drawable.getting_started),
                new Project("Zacks Quote", "making a simple change to the layout with my own personal motivational quote for software developers", R.drawable.quote),
                new Project("BMI Calculator", "A real life working BMI calculator teaching me Variables, Methods and Conditional logic", R.drawable.calculator),
                new Project("Inches Converter", "A basic converter to convert inches to meters(my own personal calculator app made on my own)", R.drawable.tape),
                new Project("The Hungry Developer", "A menu app for a fictional restaurant, learning about Activities, Classes and Objects, as well as Array Adapters and much more", R.drawable.hungry_developer)
        };

        ArrayAdapter<Project> projectsAdapter = new ArrayAdapter<>(this, R.layout.item_project, projects);
    }
}