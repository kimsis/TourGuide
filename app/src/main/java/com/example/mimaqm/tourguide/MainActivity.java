package com.example.mimaqm.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding the viewPager in the XML file
        ViewPager viewPager = findViewById(R.id.ViewPager);

        //Creating the Adapter object, to be used for the fragments
        ViewPagerFragmentAdapter viewPagerFragmentAdapter = new ViewPagerFragmentAdapter(getSupportFragmentManager());

        //Setting the adapter on the ViewPager, so that it can properly display the Fragments
        viewPager.setAdapter(viewPagerFragmentAdapter);

        //Finding the TabLayout in the XML and setting it up with the ViewPager
        TabLayout tabLayout = findViewById(R.id.TabLayout);
        tabLayout.setupWithViewPager(viewPager);
}}
