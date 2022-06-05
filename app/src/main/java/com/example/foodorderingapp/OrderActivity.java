package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorderingapp.Adapters.OrdersAdapter;
import com.example.foodorderingapp.Models.OrdersModel;
import com.example.foodorderingapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {


    ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.burgers, "Special cheese burger", "5.34" , "E4#CtyU3r1"));
    list.add(new OrdersModel(R.drawable.burger2, "Sunny side burger", "4.22" , "hU7tyU3r1"));
    list.add(new OrdersModel(R.drawable.burger2, "Capsicum burger", "3.33" , "UOP3#U3r1"));
    list.add(new OrdersModel(R.drawable.pizza3, "Special cheese pizza", "2.67" , "4#CtOp#22"));
    list.add(new OrdersModel(R.drawable.pizza3, "Double cheese pizza", "3.99" , "CtyU#663r1"));
    list.add(new OrdersModel(R.drawable.burgers, "Special cheese burger", "2.99" , "56#1tyU3r1"));
    list.add(new OrdersModel(R.drawable.burgers, "Special cheese burger", "3.99" , "90#1oPyU3r1"));
    list.add(new OrdersModel(R.drawable.pizza3, "Special cheese burger", "4.99" , "6Ol#tR3r1"));

        OrdersAdapter adapter = new OrdersAdapter(list , this);
        binding.ordersRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.ordersRecyclerView.setLayoutManager(layoutManager);
    }
}