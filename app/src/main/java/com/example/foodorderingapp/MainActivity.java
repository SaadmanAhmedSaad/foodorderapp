package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorderingapp.Adapters.MainAdapter;
import com.example.foodorderingapp.Models.MainModel;
import com.example.foodorderingapp.databinding.ActivityMainBinding;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

 ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();
   list.add( new MainModel(R.drawable.burger2, "Burger","5.99" , "Chicken Burger with lettuce"));
        list.add( new MainModel(R.drawable.pizza3, "Pizza smash","20.00" , "Pizza with cheese"));
        list.add( new MainModel(R.drawable.burger2, "Burger deluxe","12.99" , "Chicken Burger with Fries"));
        list.add( new MainModel(R.drawable.pizza3, "Pizza stash","10" , "Spicy Pizza"));
        list.add( new MainModel(R.drawable.burger2, "Burger Frenzy","5" , "Chicken Burger with spinach"));
list.add( new MainModel(R.drawable.burger2, "Burger Frenzy","5.99" , "Chicken Burger with spinach"));
list.add( new MainModel(R.drawable.burger2, "Burger Frenzy","5.99" , "Chicken Burger with spinach"));
list.add( new MainModel(R.drawable.burger2, "Burger Frenzy","5.99" , "Chicken Burger with spinach"));
list.add( new MainModel(R.drawable.burger2, "Burger Frenzy","5.99" , "Chicken Burger with spinach"));

     MainAdapter adapter = new MainAdapter(list,this);
     binding.recylerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);
    }
}