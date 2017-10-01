package com.example.android.reportcard;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LocationThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new LocationThreeFragment())
                .commit();
    }
}

