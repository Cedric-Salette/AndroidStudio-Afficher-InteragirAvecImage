package com.example.jeuandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameDisplay(this));
    }
}