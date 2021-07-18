package com.alok.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void githubProfile(View view) {

        Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/alok27a"));
        startActivity(viewIntent);
    }
}