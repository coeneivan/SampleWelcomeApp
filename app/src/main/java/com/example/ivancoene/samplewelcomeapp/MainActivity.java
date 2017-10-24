package com.example.ivancoene.samplewelcomeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntroActivity intro = new IntroActivity();
        Intent i = new Intent(MainActivity.this, intro.getClass());
        startActivity(i);
    }

}