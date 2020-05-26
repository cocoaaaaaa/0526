package com.example.cafemoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Review2Activity extends AppCompatActivity {
    String name;
    String loginID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review2);

        Intent intent = getIntent();
        name = intent.getExtras().getString("name");
        loginID = intent.getExtras().getString("loginID");

    }
}
